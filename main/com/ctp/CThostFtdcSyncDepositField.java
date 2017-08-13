/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcSyncDepositField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDepositField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcSyncDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    ctpJNI.CThostFtdcSyncDepositField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return ctpJNI.CThostFtdcSyncDepositField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcSyncDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcSyncDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcSyncDepositField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcSyncDepositField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    ctpJNI.CThostFtdcSyncDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return ctpJNI.CThostFtdcSyncDepositField_Deposit_get(swigCPtr, this);
  }

  public void setIsForce(int value) {
    ctpJNI.CThostFtdcSyncDepositField_IsForce_set(swigCPtr, this, value);
  }

  public int getIsForce() {
    return ctpJNI.CThostFtdcSyncDepositField_IsForce_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcSyncDepositField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcSyncDepositField_CurrencyID_get(swigCPtr, this);
  }

  public void setBizType(char value) {
    ctpJNI.CThostFtdcSyncDepositField_BizType_set(swigCPtr, this, value);
  }

  public char getBizType() {
    return ctpJNI.CThostFtdcSyncDepositField_BizType_get(swigCPtr, this);
  }

  public CThostFtdcSyncDepositField() {
    this(ctpJNI.new_CThostFtdcSyncDepositField(), true);
  }

}