package io.github.quickmsg.edge.mqtt.core.pair;

import io.netty.handler.codec.mqtt.MqttProperties;

import java.util.List;

/**
 * @author luxurong
 */
public record AckPair(String reason, List<MqttProperties.StringPair> userProperty) {
}
