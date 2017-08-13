/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcBrokerLimitPosiField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerLimitPosiField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerLimitPosiField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcBrokerLimitPosiField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_ExchangeID_get(swigCPtr, this);
  }

  public void setTotalVolume(double value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_TotalVolume_set(swigCPtr, this, value);
  }

  public double getTotalVolume() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_TotalVolume_get(swigCPtr, this);
  }

  public void setLongVolume(double value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_LongVolume_set(swigCPtr, this, value);
  }

  public double getLongVolume() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_LongVolume_get(swigCPtr, this);
  }

  public void setTotalVolumeFrozen(double value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_TotalVolumeFrozen_set(swigCPtr, this, value);
  }

  public double getTotalVolumeFrozen() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_TotalVolumeFrozen_get(swigCPtr, this);
  }

  public void setLongVolumeFrozen(double value) {
    ctpJNI.CThostFtdcBrokerLimitPosiField_LongVolumeFrozen_set(swigCPtr, this, value);
  }

  public double getLongVolumeFrozen() {
    return ctpJNI.CThostFtdcBrokerLimitPosiField_LongVolumeFrozen_get(swigCPtr, this);
  }

  public CThostFtdcBrokerLimitPosiField() {
    this(ctpJNI.new_CThostFtdcBrokerLimitPosiField(), true);
  }

}