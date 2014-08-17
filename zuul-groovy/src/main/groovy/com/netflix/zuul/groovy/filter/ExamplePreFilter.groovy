/**
 * Copyright 2014 Netflix, Inc.
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
package com.netflix.zuul.groovy.filter;

import com.netflix.zuul.EgressRequest;
import com.netflix.zuul.PreFilter;
import rx.Observable;

public class ExamplePreFilter<T> extends PreFilter<T> {

    @Override
    public Observable<EgressRequest<T>> apply(EgressRequest<T> egressReq) {
        println("pre filter " + this)
        Observable.just(egressReq)
    }

    @Override
    public int getOrder() {
        1
    }

    @Override
    public Observable<Boolean> shouldFilter(EgressRequest<T> input) {
        Observable.just(true)
    }
}