/*
 * Copyright 2017 Steffen Folman Sørensen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dk.sublife.snapcast.types;

/**
 * Generic POJO for Unmashalling Json Response from Snapcast
 */
public class ClientConfig {

	private Integer latency;
	private String name;
	private ClientVolume volume;
	private String stream;

	public ClientConfig() {
	}

	public void setLatency(Integer latency) {
		this.latency = latency;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(ClientVolume volume) {
		this.volume = volume;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public ClientVolume getVolume() {
		return volume;
	}

	public String getStream() {
		return stream;
	}

	public String getName() {
		return name;
	}

	public Integer getLatency() {
		return latency;
	}
}
