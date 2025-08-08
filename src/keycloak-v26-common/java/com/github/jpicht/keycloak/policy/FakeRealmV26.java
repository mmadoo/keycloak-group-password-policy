/*
 * Copyright 2019 Julian Picht
 * Copyright 2021 Brian Long (brian@inteligr8.com)
 * Copyright 2025 Saooti adaptation for Keycloak 26
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jpicht.keycloak.policy;

import org.keycloak.models.AuthenticationFlowModel;
import org.keycloak.models.RequiredActionConfigModel;

import java.util.stream.Stream;

public abstract class FakeRealmV26 extends FakeRealmV23 {

    public boolean isOrganizationsEnabled() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setOrganizationsEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getMaxTemporaryLockouts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setMaxTemporaryLockouts(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public AuthenticationFlowModel getFirstBrokerLoginFlow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFirstBrokerLoginFlow(AuthenticationFlowModel authenticationFlowModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public RequiredActionConfigModel getRequiredActionConfigById(String s) {
        throw new UnsupportedOperationException("Not supported yet.");    }

    public RequiredActionConfigModel getRequiredActionConfigByAlias(String s) {
        throw new UnsupportedOperationException("Not supported yet.");    }

    public void removeRequiredActionProviderConfig(RequiredActionConfigModel requiredActionConfigModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateRequiredActionConfig(RequiredActionConfigModel requiredActionConfigModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Stream<RequiredActionConfigModel> getRequiredActionConfigsStream() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}