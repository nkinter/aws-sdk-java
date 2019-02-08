/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Channel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelJsonUnmarshaller implements Unmarshaller<Channel, JsonUnmarshallerContext> {

    public Channel unmarshall(JsonUnmarshallerContext context) throws Exception {
        Channel channel = new Channel();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    channel.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinations", targetDepth)) {
                    context.nextToken();
                    channel.setDestinations(new ListUnmarshaller<OutputDestination>(OutputDestinationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("egressEndpoints", targetDepth)) {
                    context.nextToken();
                    channel.setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(ChannelEgressEndpointJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("encoderSettings", targetDepth)) {
                    context.nextToken();
                    channel.setEncoderSettings(EncoderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    channel.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputAttachments", targetDepth)) {
                    context.nextToken();
                    channel.setInputAttachments(new ListUnmarshaller<InputAttachment>(InputAttachmentJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("inputSpecification", targetDepth)) {
                    context.nextToken();
                    channel.setInputSpecification(InputSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logLevel", targetDepth)) {
                    context.nextToken();
                    channel.setLogLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    channel.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelinesRunningCount", targetDepth)) {
                    context.nextToken();
                    channel.setPipelinesRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    channel.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    channel.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    channel.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return channel;
    }

    private static ChannelJsonUnmarshaller instance;

    public static ChannelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonUnmarshaller();
        return instance;
    }
}
