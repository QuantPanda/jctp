/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcExchangeExecOrderActionErrorField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeExecOrderActionErrorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeExecOrderActionErrorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeExecOrderActionErrorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_InstallID_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ActionLocalID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_ErrorMsg_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcExchangeExecOrderActionErrorField_BrokerID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeExecOrderActionErrorField() {
    this(ctpJNI.new_CThostFtdcExchangeExecOrderActionErrorField(), true);
  }

}
