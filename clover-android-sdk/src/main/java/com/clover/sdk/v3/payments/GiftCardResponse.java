/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getTxType txType}</li>
 * <li>{@link #getState state}</li>
 * <li>{@link #getRequestAmount requestAmount}</li>
 * <li>{@link #getPayment payment}</li>
 * <li>{@link #getResponseMessage responseMessage}</li>
 * <li>{@link #getRequestSuccessful requestSuccessful}</li>
 * <li>{@link #getAccountNumber accountNumber}</li>
 * <li>{@link #getScv scv}</li>
 * <li>{@link #getGiftCardTxUuid giftCardTxUuid}</li>
 * <li>{@link #getTransactionId transactionId}</li>
 * <li>{@link #getReferenceUuid referenceUuid}</li>
 * <li>{@link #getAuthCode authCode}</li>
 * <li>{@link #getBegBal begBal}</li>
 * <li>{@link #getEndBal endBal}</li>
 * <li>{@link #getHoldBal holdBal}</li>
 * <li>{@link #getSyncPaymentObject syncPaymentObject}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class GiftCardResponse extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.payments.TxType getTxType() {
    return genClient.cacheGet(CacheKey.txType);
  }

  public com.clover.sdk.v3.payments.GiftCardState getState() {
    return genClient.cacheGet(CacheKey.state);
  }

  /**
   * Transaction Amount
   */
  public java.lang.Long getRequestAmount() {
    return genClient.cacheGet(CacheKey.requestAmount);
  }

  public com.clover.sdk.v3.payments.Payment getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }

  public java.lang.String getResponseMessage() {
    return genClient.cacheGet(CacheKey.responseMessage);
  }

  public java.lang.Boolean getRequestSuccessful() {
    return genClient.cacheGet(CacheKey.requestSuccessful);
  }

  public java.lang.String getAccountNumber() {
    return genClient.cacheGet(CacheKey.accountNumber);
  }

  public java.lang.String getScv() {
    return genClient.cacheGet(CacheKey.scv);
  }

  public java.lang.String getGiftCardTxUuid() {
    return genClient.cacheGet(CacheKey.giftCardTxUuid);
  }

  public java.lang.String getTransactionId() {
    return genClient.cacheGet(CacheKey.transactionId);
  }

  public java.lang.String getReferenceUuid() {
    return genClient.cacheGet(CacheKey.referenceUuid);
  }

  public java.lang.String getAuthCode() {
    return genClient.cacheGet(CacheKey.authCode);
  }

  public java.lang.Long getBegBal() {
    return genClient.cacheGet(CacheKey.begBal);
  }

  public java.lang.Long getEndBal() {
    return genClient.cacheGet(CacheKey.endBal);
  }

  public java.lang.Long getHoldBal() {
    return genClient.cacheGet(CacheKey.holdBal);
  }

  public java.lang.Boolean getSyncPaymentObject() {
    return genClient.cacheGet(CacheKey.syncPaymentObject);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<GiftCardResponse> {
    txType {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractEnum("txType", com.clover.sdk.v3.payments.TxType.class);
      }
    },
    state {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractEnum("state", com.clover.sdk.v3.payments.GiftCardState.class);
      }
    },
    requestAmount {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("requestAmount", java.lang.Long.class);
      }
    },
    payment {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractRecord("payment", com.clover.sdk.v3.payments.Payment.JSON_CREATOR);
      }
    },
    responseMessage {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("responseMessage", java.lang.String.class);
      }
    },
    requestSuccessful {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("requestSuccessful", java.lang.Boolean.class);
      }
    },
    accountNumber {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("accountNumber", java.lang.String.class);
      }
    },
    scv {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("scv", java.lang.String.class);
      }
    },
    giftCardTxUuid {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("giftCardTxUuid", java.lang.String.class);
      }
    },
    transactionId {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("transactionId", java.lang.String.class);
      }
    },
    referenceUuid {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("referenceUuid", java.lang.String.class);
      }
    },
    authCode {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("authCode", java.lang.String.class);
      }
    },
    begBal {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("begBal", java.lang.Long.class);
      }
    },
    endBal {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("endBal", java.lang.Long.class);
      }
    },
    holdBal {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("holdBal", java.lang.Long.class);
      }
    },
    syncPaymentObject {
      @Override
      public Object extractValue(GiftCardResponse instance) {
        return instance.genClient.extractOther("syncPaymentObject", java.lang.Boolean.class);
      }
    },
    ;
  }

  private GenericClient<GiftCardResponse> genClient;

  /**
  * Constructs a new empty instance.
  */
  public GiftCardResponse() {
    genClient = new GenericClient<GiftCardResponse>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected GiftCardResponse(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public GiftCardResponse(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public GiftCardResponse(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public GiftCardResponse(GiftCardResponse src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'txType' field is set and is not null */
  public boolean isNotNullTxType() {
    return genClient.cacheValueIsNotNull(CacheKey.txType);
  }

  /** Checks whether the 'state' field is set and is not null */
  public boolean isNotNullState() {
    return genClient.cacheValueIsNotNull(CacheKey.state);
  }

  /** Checks whether the 'requestAmount' field is set and is not null */
  public boolean isNotNullRequestAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.requestAmount);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'responseMessage' field is set and is not null */
  public boolean isNotNullResponseMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.responseMessage);
  }

  /** Checks whether the 'requestSuccessful' field is set and is not null */
  public boolean isNotNullRequestSuccessful() {
    return genClient.cacheValueIsNotNull(CacheKey.requestSuccessful);
  }

  /** Checks whether the 'accountNumber' field is set and is not null */
  public boolean isNotNullAccountNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.accountNumber);
  }

  /** Checks whether the 'scv' field is set and is not null */
  public boolean isNotNullScv() {
    return genClient.cacheValueIsNotNull(CacheKey.scv);
  }

  /** Checks whether the 'giftCardTxUuid' field is set and is not null */
  public boolean isNotNullGiftCardTxUuid() {
    return genClient.cacheValueIsNotNull(CacheKey.giftCardTxUuid);
  }

  /** Checks whether the 'transactionId' field is set and is not null */
  public boolean isNotNullTransactionId() {
    return genClient.cacheValueIsNotNull(CacheKey.transactionId);
  }

  /** Checks whether the 'referenceUuid' field is set and is not null */
  public boolean isNotNullReferenceUuid() {
    return genClient.cacheValueIsNotNull(CacheKey.referenceUuid);
  }

  /** Checks whether the 'authCode' field is set and is not null */
  public boolean isNotNullAuthCode() {
    return genClient.cacheValueIsNotNull(CacheKey.authCode);
  }

  /** Checks whether the 'begBal' field is set and is not null */
  public boolean isNotNullBegBal() {
    return genClient.cacheValueIsNotNull(CacheKey.begBal);
  }

  /** Checks whether the 'endBal' field is set and is not null */
  public boolean isNotNullEndBal() {
    return genClient.cacheValueIsNotNull(CacheKey.endBal);
  }

  /** Checks whether the 'holdBal' field is set and is not null */
  public boolean isNotNullHoldBal() {
    return genClient.cacheValueIsNotNull(CacheKey.holdBal);
  }

  /** Checks whether the 'syncPaymentObject' field is set and is not null */
  public boolean isNotNullSyncPaymentObject() {
    return genClient.cacheValueIsNotNull(CacheKey.syncPaymentObject);
  }



  /** Checks whether the 'txType' field has been set, however the value could be null */
  public boolean hasTxType() {
    return genClient.cacheHasKey(CacheKey.txType);
  }

  /** Checks whether the 'state' field has been set, however the value could be null */
  public boolean hasState() {
    return genClient.cacheHasKey(CacheKey.state);
  }

  /** Checks whether the 'requestAmount' field has been set, however the value could be null */
  public boolean hasRequestAmount() {
    return genClient.cacheHasKey(CacheKey.requestAmount);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'responseMessage' field has been set, however the value could be null */
  public boolean hasResponseMessage() {
    return genClient.cacheHasKey(CacheKey.responseMessage);
  }

  /** Checks whether the 'requestSuccessful' field has been set, however the value could be null */
  public boolean hasRequestSuccessful() {
    return genClient.cacheHasKey(CacheKey.requestSuccessful);
  }

  /** Checks whether the 'accountNumber' field has been set, however the value could be null */
  public boolean hasAccountNumber() {
    return genClient.cacheHasKey(CacheKey.accountNumber);
  }

  /** Checks whether the 'scv' field has been set, however the value could be null */
  public boolean hasScv() {
    return genClient.cacheHasKey(CacheKey.scv);
  }

  /** Checks whether the 'giftCardTxUuid' field has been set, however the value could be null */
  public boolean hasGiftCardTxUuid() {
    return genClient.cacheHasKey(CacheKey.giftCardTxUuid);
  }

  /** Checks whether the 'transactionId' field has been set, however the value could be null */
  public boolean hasTransactionId() {
    return genClient.cacheHasKey(CacheKey.transactionId);
  }

  /** Checks whether the 'referenceUuid' field has been set, however the value could be null */
  public boolean hasReferenceUuid() {
    return genClient.cacheHasKey(CacheKey.referenceUuid);
  }

  /** Checks whether the 'authCode' field has been set, however the value could be null */
  public boolean hasAuthCode() {
    return genClient.cacheHasKey(CacheKey.authCode);
  }

  /** Checks whether the 'begBal' field has been set, however the value could be null */
  public boolean hasBegBal() {
    return genClient.cacheHasKey(CacheKey.begBal);
  }

  /** Checks whether the 'endBal' field has been set, however the value could be null */
  public boolean hasEndBal() {
    return genClient.cacheHasKey(CacheKey.endBal);
  }

  /** Checks whether the 'holdBal' field has been set, however the value could be null */
  public boolean hasHoldBal() {
    return genClient.cacheHasKey(CacheKey.holdBal);
  }

  /** Checks whether the 'syncPaymentObject' field has been set, however the value could be null */
  public boolean hasSyncPaymentObject() {
    return genClient.cacheHasKey(CacheKey.syncPaymentObject);
  }


  /**
   * Sets the field 'txType'.
   */
  public GiftCardResponse setTxType(com.clover.sdk.v3.payments.TxType txType) {
    return genClient.setOther(txType, CacheKey.txType);
  }

  /**
   * Sets the field 'state'.
   */
  public GiftCardResponse setState(com.clover.sdk.v3.payments.GiftCardState state) {
    return genClient.setOther(state, CacheKey.state);
  }

  /**
   * Sets the field 'requestAmount'.
   */
  public GiftCardResponse setRequestAmount(java.lang.Long requestAmount) {
    return genClient.setOther(requestAmount, CacheKey.requestAmount);
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public GiftCardResponse setPayment(com.clover.sdk.v3.payments.Payment payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }

  /**
   * Sets the field 'responseMessage'.
   */
  public GiftCardResponse setResponseMessage(java.lang.String responseMessage) {
    return genClient.setOther(responseMessage, CacheKey.responseMessage);
  }

  /**
   * Sets the field 'requestSuccessful'.
   */
  public GiftCardResponse setRequestSuccessful(java.lang.Boolean requestSuccessful) {
    return genClient.setOther(requestSuccessful, CacheKey.requestSuccessful);
  }

  /**
   * Sets the field 'accountNumber'.
   */
  public GiftCardResponse setAccountNumber(java.lang.String accountNumber) {
    return genClient.setOther(accountNumber, CacheKey.accountNumber);
  }

  /**
   * Sets the field 'scv'.
   */
  public GiftCardResponse setScv(java.lang.String scv) {
    return genClient.setOther(scv, CacheKey.scv);
  }

  /**
   * Sets the field 'giftCardTxUuid'.
   */
  public GiftCardResponse setGiftCardTxUuid(java.lang.String giftCardTxUuid) {
    return genClient.setOther(giftCardTxUuid, CacheKey.giftCardTxUuid);
  }

  /**
   * Sets the field 'transactionId'.
   */
  public GiftCardResponse setTransactionId(java.lang.String transactionId) {
    return genClient.setOther(transactionId, CacheKey.transactionId);
  }

  /**
   * Sets the field 'referenceUuid'.
   */
  public GiftCardResponse setReferenceUuid(java.lang.String referenceUuid) {
    return genClient.setOther(referenceUuid, CacheKey.referenceUuid);
  }

  /**
   * Sets the field 'authCode'.
   */
  public GiftCardResponse setAuthCode(java.lang.String authCode) {
    return genClient.setOther(authCode, CacheKey.authCode);
  }

  /**
   * Sets the field 'begBal'.
   */
  public GiftCardResponse setBegBal(java.lang.Long begBal) {
    return genClient.setOther(begBal, CacheKey.begBal);
  }

  /**
   * Sets the field 'endBal'.
   */
  public GiftCardResponse setEndBal(java.lang.Long endBal) {
    return genClient.setOther(endBal, CacheKey.endBal);
  }

  /**
   * Sets the field 'holdBal'.
   */
  public GiftCardResponse setHoldBal(java.lang.Long holdBal) {
    return genClient.setOther(holdBal, CacheKey.holdBal);
  }

  /**
   * Sets the field 'syncPaymentObject'.
   */
  public GiftCardResponse setSyncPaymentObject(java.lang.Boolean syncPaymentObject) {
    return genClient.setOther(syncPaymentObject, CacheKey.syncPaymentObject);
  }


  /** Clears the 'txType' field, the 'has' method for this field will now return false */
  public void clearTxType() {
    genClient.clear(CacheKey.txType);
  }
  /** Clears the 'state' field, the 'has' method for this field will now return false */
  public void clearState() {
    genClient.clear(CacheKey.state);
  }
  /** Clears the 'requestAmount' field, the 'has' method for this field will now return false */
  public void clearRequestAmount() {
    genClient.clear(CacheKey.requestAmount);
  }
  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
  }
  /** Clears the 'responseMessage' field, the 'has' method for this field will now return false */
  public void clearResponseMessage() {
    genClient.clear(CacheKey.responseMessage);
  }
  /** Clears the 'requestSuccessful' field, the 'has' method for this field will now return false */
  public void clearRequestSuccessful() {
    genClient.clear(CacheKey.requestSuccessful);
  }
  /** Clears the 'accountNumber' field, the 'has' method for this field will now return false */
  public void clearAccountNumber() {
    genClient.clear(CacheKey.accountNumber);
  }
  /** Clears the 'scv' field, the 'has' method for this field will now return false */
  public void clearScv() {
    genClient.clear(CacheKey.scv);
  }
  /** Clears the 'giftCardTxUuid' field, the 'has' method for this field will now return false */
  public void clearGiftCardTxUuid() {
    genClient.clear(CacheKey.giftCardTxUuid);
  }
  /** Clears the 'transactionId' field, the 'has' method for this field will now return false */
  public void clearTransactionId() {
    genClient.clear(CacheKey.transactionId);
  }
  /** Clears the 'referenceUuid' field, the 'has' method for this field will now return false */
  public void clearReferenceUuid() {
    genClient.clear(CacheKey.referenceUuid);
  }
  /** Clears the 'authCode' field, the 'has' method for this field will now return false */
  public void clearAuthCode() {
    genClient.clear(CacheKey.authCode);
  }
  /** Clears the 'begBal' field, the 'has' method for this field will now return false */
  public void clearBegBal() {
    genClient.clear(CacheKey.begBal);
  }
  /** Clears the 'endBal' field, the 'has' method for this field will now return false */
  public void clearEndBal() {
    genClient.clear(CacheKey.endBal);
  }
  /** Clears the 'holdBal' field, the 'has' method for this field will now return false */
  public void clearHoldBal() {
    genClient.clear(CacheKey.holdBal);
  }
  /** Clears the 'syncPaymentObject' field, the 'has' method for this field will now return false */
  public void clearSyncPaymentObject() {
    genClient.clear(CacheKey.syncPaymentObject);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public GiftCardResponse copyChanges() {
    GiftCardResponse copy = new GiftCardResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(GiftCardResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new GiftCardResponse(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<GiftCardResponse> CREATOR = new android.os.Parcelable.Creator<GiftCardResponse>() {
    @Override
    public GiftCardResponse createFromParcel(android.os.Parcel in) {
      GiftCardResponse instance = new GiftCardResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public GiftCardResponse[] newArray(int size) {
      return new GiftCardResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<GiftCardResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<GiftCardResponse>() {
    @Override
    public GiftCardResponse create(org.json.JSONObject jsonObject) {
      return new GiftCardResponse(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean TXTYPE_IS_REQUIRED = false;
    public static final boolean STATE_IS_REQUIRED = false;
    public static final boolean REQUESTAMOUNT_IS_REQUIRED = false;
    public static final boolean PAYMENT_IS_REQUIRED = false;
    public static final boolean RESPONSEMESSAGE_IS_REQUIRED = false;
    public static final boolean REQUESTSUCCESSFUL_IS_REQUIRED = false;
    public static final boolean ACCOUNTNUMBER_IS_REQUIRED = false;
    public static final boolean SCV_IS_REQUIRED = false;
    public static final boolean GIFTCARDTXUUID_IS_REQUIRED = false;
    public static final boolean TRANSACTIONID_IS_REQUIRED = false;
    public static final boolean REFERENCEUUID_IS_REQUIRED = false;
    public static final boolean AUTHCODE_IS_REQUIRED = false;
    public static final boolean BEGBAL_IS_REQUIRED = false;
    public static final boolean ENDBAL_IS_REQUIRED = false;
    public static final boolean HOLDBAL_IS_REQUIRED = false;
    public static final boolean SYNCPAYMENTOBJECT_IS_REQUIRED = false;

  }

}
