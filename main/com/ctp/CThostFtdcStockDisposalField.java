/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcStockDisposalField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcStockDisposalField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcStockDisposalField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcStockDisposalField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcStockDisposalField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcStockDisposalField_InvestorID_get(swigCPtr, this);
  }

  public void setStockDisposalRef(String value) {
    ctpJNI.CThostFtdcStockDisposalField_StockDisposalRef_set(swigCPtr, this, value);
  }

  public String getStockDisposalRef() {
    return ctpJNI.CThostFtdcStockDisposalField_StockDisposalRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcStockDisposalField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcStockDisposalField_InstrumentID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcStockDisposalField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcStockDisposalField_Volume_get(swigCPtr, this);
  }

  public void setStockDisposalType(char value) {
    ctpJNI.CThostFtdcStockDisposalField_StockDisposalType_set(swigCPtr, this, value);
  }

  public char getStockDisposalType() {
    return ctpJNI.CThostFtdcStockDisposalField_StockDisposalType_get(swigCPtr, this);
  }

  public void setStockDisposalLocalID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_StockDisposalLocalID_set(swigCPtr, this, value);
  }

  public String getStockDisposalLocalID() {
    return ctpJNI.CThostFtdcStockDisposalField_StockDisposalLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcStockDisposalField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcStockDisposalField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcStockDisposalField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcStockDisposalField_ClientID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcStockDisposalField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcStockDisposalField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcStockDisposalField_InstallID_get(swigCPtr, this);
  }

  public void setStockDisposalStatus(char value) {
    ctpJNI.CThostFtdcStockDisposalField_StockDisposalStatus_set(swigCPtr, this, value);
  }

  public char getStockDisposalStatus() {
    return ctpJNI.CThostFtdcStockDisposalField_StockDisposalStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpJNI.CThostFtdcStockDisposalField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpJNI.CThostFtdcStockDisposalField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcStockDisposalField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcStockDisposalField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CThostFtdcStockDisposalField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CThostFtdcStockDisposalField_SettlementID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpJNI.CThostFtdcStockDisposalField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpJNI.CThostFtdcStockDisposalField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpJNI.CThostFtdcStockDisposalField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpJNI.CThostFtdcStockDisposalField_InsertTime_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CThostFtdcStockDisposalField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CThostFtdcStockDisposalField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcStockDisposalField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcStockDisposalField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CThostFtdcStockDisposalField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CThostFtdcStockDisposalField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpJNI.CThostFtdcStockDisposalField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpJNI.CThostFtdcStockDisposalField_StatusMsg_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpJNI.CThostFtdcStockDisposalField_BranchID_get(swigCPtr, this);
  }

  public void setStockDisposalSysID(String value) {
    ctpJNI.CThostFtdcStockDisposalField_StockDisposalSysID_set(swigCPtr, this, value);
  }

  public String getStockDisposalSysID() {
    return ctpJNI.CThostFtdcStockDisposalField_StockDisposalSysID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcStockDisposalField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcStockDisposalField_BusinessUnit_get(swigCPtr, this);
  }

  public CThostFtdcStockDisposalField() {
    this(ctpJNI.new_CThostFtdcStockDisposalField(), true);
  }

}
