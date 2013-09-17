/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gigaspaces.blueprint.frauddetection.common;

import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: guyl
 * Date: 1/19/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserPaymentMsg implements Serializable {

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @SpaceRouting
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Payment payment;
    private User user;
    private Long userId;
    @SpaceId
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    private Long paymentId;


    public UserPaymentMsg(Payment payment, User user) {

        this.payment = payment;
        this.user = user;
        this.userId = user.getId();
        this.paymentId = payment.getId();

    }
    public UserPaymentMsg(){}
}
