/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
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
package org.kaazing.gateway.client.impl.ws;

import org.kaazing.gateway.client.impl.WebSocketChannel;
import org.kaazing.gateway.client.impl.util.WSURI;

public abstract class WebSocketSelectedChannel extends WebSocketChannel {

    WebSocketSelectedHandler handler;

    protected ReadyState readyState = ReadyState.CONNECTING;

    protected String[] requestedProtocols;
    
//    /** The protocol selected upon the completion of the WebSocket handshake */
//    protected String selectedProtocol;

    public WebSocketSelectedChannel(WSURI location) {
        super(location);
    }
    
    public ReadyState getReadyState() {
        return readyState;
    }

    public String[] getRequestedProtocols() {
        return requestedProtocols;
    }
}
