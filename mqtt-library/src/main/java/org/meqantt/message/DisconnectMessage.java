/*******************************************************************************
 * Copyright 2011 Albin Theander
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.meqantt.message;

import java.io.IOException;

public class DisconnectMessage extends Message {

	public DisconnectMessage() {
		super(Type.DISCONNECT);
	}
	
	public DisconnectMessage(Header header) throws IOException{
		super(header);
	}
	
	@Override
	public void setDup(boolean dup) {
		throw new UnsupportedOperationException("DISCONNECT message does not support the DUP flag");
	}
	
	@Override
	public void setQos(QoS qos) {
		throw new UnsupportedOperationException("DISCONNECT message does not support the QoS flag");
	}
	
	@Override
	public void setRetained(boolean retain) {
		throw new UnsupportedOperationException("DISCONNECT message does not support the RETAIN flag");
	}

}
