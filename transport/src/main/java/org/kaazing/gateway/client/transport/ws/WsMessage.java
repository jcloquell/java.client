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
package org.kaazing.gateway.client.transport.ws;

import java.nio.ByteBuffer;

public class WsMessage {

    public static enum Kind {
        BINARY, TEXT, CLOSE, COMMAND, PING, PONG
    };

    private Kind kind;
    
    public Kind getKind() {
        return kind;
    }

    private final ByteBuffer buf;

    public WsMessage(ByteBuffer buf, Kind kind) {
        this.buf = buf;
        this.kind = kind;
    }

    public ByteBuffer getBytes() {
        return buf;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getKind());
        builder.append(':');
        builder.append(' ');
        builder.append(buf.array().toString());
        return builder.toString();
    }
}
