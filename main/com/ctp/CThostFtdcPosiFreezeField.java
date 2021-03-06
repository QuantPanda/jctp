/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcPosiFreezeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcPosiFreezeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcPosiFreezeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcPosiFreezeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcPosiFreezeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcPosiFreezeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcPosiFreezeField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcPosiFreezeField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CThostFtdcPosiFreezeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcPosiFreezeField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcPosiFreezeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcPosiFreezeField_ParticipantID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcPosiFreezeField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcPosiFreezeField_InstallID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcPosiFreezeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcPosiFreezeField_Volume_get(swigCPtr, this);
  }

  public void setFreezeReasonType(char value) {
    ctpJNI.CThostFtdcPosiFreezeField_FreezeReasonType_set(swigCPtr, this, value);
  }

  public char getFreezeReasonType() {
    return ctpJNI.CThostFtdcPosiFreezeField_FreezeReasonType_get(swigCPtr, this);
  }

  public void setFreezeType(char value) {
    ctpJNI.CThostFtdcPosiFreezeField_FreezeType_set(swigCPtr, this, value);
  }

  public char getFreezeType() {
    return ctpJNI.CThostFtdcPosiFreezeField_FreezeType_get(swigCPtr, this);
  }

  public CThostFtdcPosiFreezeField() {
    this(ctpJNI.new_CThostFtdcPosiFreezeField(), true);
  }

}
