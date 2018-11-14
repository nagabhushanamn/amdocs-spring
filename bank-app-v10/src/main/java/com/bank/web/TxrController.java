package com.bank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.POST, consumes = { "application/xml" })
	public @ResponseBody TxrResponse doTxr(@RequestBody TxrRequest request) {
		boolean b = txrService.txr(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
		TxrResponse response = new TxrResponse();
		response.setStatus(b ? "Txr success" : "txr Failed");
		return response;
	}

}
