package com.flydubai.reaccom.service.impl.dcs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flydubai.reaccom.config.ReaccomConfig;
import com.flydubai.reaccom.dcs.response.PaxSummaryResponse;
import com.flydubai.reaccom.inoker.ResourceRequester;
import com.flydubai.reaccom.model.Flight;
import com.flydubai.reaccom.model.Pax;
import com.flydubai.reaccom.model.PnrGroup;
import com.flydubai.reaccom.service.ReaccomServiceInvoker;

@Service("paxSummary")
public class PaxSummaryInvokerImpl implements ReaccomServiceInvoker {

	@Override
	public void invokeAndEnrichResponse(String fltNum, String origin, String dest, String startDate, String endDate,
			String doo, List<Flight> flights) {

		String token = ResourceRequester.INSTANCE.generateToken();
		for (Flight flight : flights) {

			// String url = ReaccomConfig.INSTANCE.getPaxSummaryUrl() +
			// "DXB/2018-03-21/551/summary";
			String url = ReaccomConfig.INSTANCE.getPaxSummaryUrl() + origin + "/"
					+ LocalDateTime.parse(flight.getDepDate()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "/"
					+ flight.getFltNum() + "/summary";

			ResponseEntity<PaxSummaryResponse[]> response = ResourceRequester.INSTANCE
					.invokeGetRequest(PaxSummaryResponse[].class, url, token);

			if (response.getBody() != null) {
				Map<String, PnrGroup> pnrGroups = new HashMap<>();
				for (PaxSummaryResponse summaryResponse : response.getBody()) {
					PnrGroup pnrGroup=new PnrGroup();
					List<Pax> paxList=new ArrayList<Pax>();
					Pax pax=new Pax();
					pax.setPaxFirstName(summaryResponse.getPax().getFName());
					pax.setPaxLastName(summaryResponse.getPax().getLName());
					pax.setConfirmNumber(summaryResponse.getPnrNum());
					pax.setSeatNum(summaryResponse.getSeatNum());
					pax.setSsr(summaryResponse.getServiceCodes());
//					pax.setFfpid(summaryResponse.get);
					pax.setCabinType(summaryResponse.getClass_());
					paxList.add(pax);
					pnrGroup.setPaxList(paxList);
					pnrGroups.put(System.currentTimeMillis()+"", pnrGroup);
					flight.setPnrGroups(pnrGroups);

				}

			}
		}
	}

}
