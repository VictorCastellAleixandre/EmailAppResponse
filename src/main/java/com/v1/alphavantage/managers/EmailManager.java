package com.v1.alphavantage.managers;

import com.v1.alphavantage.dtos.FormEmailDTO;
import java.util.List;

public interface EmailManager {

    String sendEmail(FormEmailDTO formEmailDTO);

}
