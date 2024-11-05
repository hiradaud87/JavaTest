public class pubsubclass {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.google.pubsub.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

    public final class PubsubMessage extends GeneratedMessageV3 implements PubsubMessageOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int DATA_FIELD_NUMBER = 1;
        private ByteString data_;
        public static final int ATTRIBUTES_FIELD_NUMBER = 2;
        private MapField<String, String> attributes_;
        public static final int MESSAGE_ID_FIELD_NUMBER = 3;
        private volatile Object messageId_;
        public static final int PUBLISH_TIME_FIELD_NUMBER = 4;
        private Timestamp publishTime_;
        public static final int ORDERING_KEY_FIELD_NUMBER = 5;
        private volatile Object orderingKey_;
        private byte memoizedIsInitialized;
        private static final PubsubMessage DEFAULT_INSTANCE = new PubsubMessage();
        private static final Parser<PubsubMessage> PARSER = new AbstractParser<PubsubMessage>() {
            public PubsubMessage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                Builder builder = PubsubMessage.newBuilder();

                try {
                    builder.mergeFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var5) {
                    InvalidProtocolBufferException ex = var5;
                    throw ex.setUnfinishedMessage(builder.buildPartial());
                } catch (UninitializedMessageException var6) {
                    UninitializedMessageException e = var6;
                    throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
                } catch (IOException var7) {
                    IOException exx = var7;
                    throw (new InvalidProtocolBufferException(exx)).setUnfinishedMessage(builder.buildPartial());
                }

                return builder.buildPartial();
            }
        };

        private PubsubMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.data_ = ByteString.EMPTY;
            this.messageId_ = "";
            this.orderingKey_ = "";
            this.memoizedIsInitialized = -1;
        }

        private PubsubMessage() {
            this.data_ = ByteString.EMPTY;
            this.messageId_ = "";
            this.orderingKey_ = "";
            this.memoizedIsInitialized = -1;
            this.data_ = ByteString.EMPTY;
            this.messageId_ = "";
            this.orderingKey_ = "";
        }

        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
            return new PubsubMessage();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_descriptor;
        }

        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int number) {
            switch (number) {
                case 2:
                    return this.internalGetAttributes();
                default:
                    throw new RuntimeException("Invalid map field number: " + number);
            }
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PubsubMessage.class, Builder.class);
        }

        public ByteString getData() {
            return this.data_;
        }

        private MapField<String, String> internalGetAttributes() {
            return this.attributes_ == null ? MapField.emptyMapField(PubsubMessage.AttributesDefaultEntryHolder.defaultEntry) : this.attributes_;
        }

        public int getAttributesCount() {
            return this.internalGetAttributes().getMap().size();
        }

        public boolean containsAttributes(String key) {
            if (key == null) {
                throw new NullPointerException("map key");
            } else {
                return this.internalGetAttributes().getMap().containsKey(key);
            }
        }

        /** @deprecated */
        @Deprecated
        public Map<String, String> getAttributes() {
            return this.getAttributesMap();
        }

        public Map<String, String> getAttributesMap() {
            return this.internalGetAttributes().getMap();
        }

        public String getAttributesOrDefault(String key, String defaultValue) {
            if (key == null) {
                throw new NullPointerException("map key");
            } else {
                Map<String, String> map = this.internalGetAttributes().getMap();
                return map.containsKey(key) ? (String)map.get(key) : defaultValue;
            }
        }

        public String getAttributesOrThrow(String key) {
            if (key == null) {
                throw new NullPointerException("map key");
            } else {
                Map<String, String> map = this.internalGetAttributes().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                } else {
                    return (String)map.get(key);
                }
            }
        }

        public String getMessageId() {
            Object ref = this.messageId_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.messageId_ = s;
                return s;
            }
        }

        public ByteString getMessageIdBytes() {
            Object ref = this.messageId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.messageId_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean hasPublishTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public Timestamp getPublishTime() {
            return this.publishTime_ == null ? Timestamp.getDefaultInstance() : this.publishTime_;
        }

        public TimestampOrBuilder getPublishTimeOrBuilder() {
            return this.publishTime_ == null ? Timestamp.getDefaultInstance() : this.publishTime_;
        }

        public String getOrderingKey() {
            Object ref = this.orderingKey_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.orderingKey_ = s;
                return s;
            }
        }

        public ByteString getOrderingKeyBytes() {
            Object ref = this.orderingKey_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.orderingKey_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            } else if (isInitialized == 0) {
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if (!this.data_.isEmpty()) {
                output.writeBytes(1, this.data_);
            }

            GeneratedMessageV3.serializeStringMapTo(output, this.internalGetAttributes(), PubsubMessage.AttributesDefaultEntryHolder.defaultEntry, 2);
            if (!GeneratedMessageV3.isStringEmpty(this.messageId_)) {
                GeneratedMessageV3.writeString(output, 3, this.messageId_);
            }

            if ((this.bitField0_ & 1) != 0) {
                output.writeMessage(4, this.getPublishTime());
            }

            if (!GeneratedMessageV3.isStringEmpty(this.orderingKey_)) {
                GeneratedMessageV3.writeString(output, 5, this.orderingKey_);
            }

            this.getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (!this.data_.isEmpty()) {
                    size += CodedOutputStream.computeBytesSize(1, this.data_);
                }

                MapEntry attributes__;
                for(Iterator var2 = this.internalGetAttributes().getMap().entrySet().iterator(); var2.hasNext(); size += CodedOutputStream.computeMessageSize(2, attributes__)) {
                    Map.Entry<String, String> entry = (Map.Entry)var2.next();
                    attributes__ = PubsubMessage.AttributesDefaultEntryHolder.defaultEntry.newBuilderForType().setKey((String)entry.getKey()).setValue((String)entry.getValue()).build();
                }

                if (!GeneratedMessageV3.isStringEmpty(this.messageId_)) {
                    size += GeneratedMessageV3.computeStringSize(3, this.messageId_);
                }

                if ((this.bitField0_ & 1) != 0) {
                    size += CodedOutputStream.computeMessageSize(4, this.getPublishTime());
                }

                if (!GeneratedMessageV3.isStringEmpty(this.orderingKey_)) {
                    size += GeneratedMessageV3.computeStringSize(5, this.orderingKey_);
                }

                size += this.getUnknownFields().getSerializedSize();
                this.memoizedSize = size;
                return size;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof PubsubMessage)) {
                return super.equals(obj);
            } else {
                PubsubMessage other = (PubsubMessage)obj;
                if (!this.getData().equals(other.getData())) {
                    return false;
                } else if (!this.internalGetAttributes().equals(other.internalGetAttributes())) {
                    return false;
                } else if (!this.getMessageId().equals(other.getMessageId())) {
                    return false;
                } else if (this.hasPublishTime() != other.hasPublishTime()) {
                    return false;
                } else if (this.hasPublishTime() && !this.getPublishTime().equals(other.getPublishTime())) {
                    return false;
                } else if (!this.getOrderingKey().equals(other.getOrderingKey())) {
                    return false;
                } else {
                    return this.getUnknownFields().equals(other.getUnknownFields());
                }
            }
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getData().hashCode();
                if (!this.internalGetAttributes().getMap().isEmpty()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.internalGetAttributes().hashCode();
                }

                hash = 37 * hash + 3;
                hash = 53 * hash + this.getMessageId().hashCode();
                if (this.hasPublishTime()) {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getPublishTime().hashCode();
                }

                hash = 37 * hash + 5;
                hash = 53 * hash + this.getOrderingKey().hashCode();
                hash = 29 * hash + this.getUnknownFields().hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static PubsubMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PubsubMessage)PARSER.parseFrom(data);
        }

        public static PubsubMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PubsubMessage)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PubsubMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PubsubMessage)PARSER.parseFrom(data);
        }

        public static PubsubMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PubsubMessage)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PubsubMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PubsubMessage)PARSER.parseFrom(data);
        }

        public static PubsubMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PubsubMessage)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PubsubMessage parseFrom(InputStream input) throws IOException {
            return (PubsubMessage)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PubsubMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PubsubMessage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PubsubMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PubsubMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PubsubMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PubsubMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PubsubMessage parseFrom(CodedInputStream input) throws IOException {
            return (PubsubMessage)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PubsubMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PubsubMessage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PubsubMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
        }

        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static PubsubMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PubsubMessage> parser() {
            return PARSER;
        }

        public Parser<PubsubMessage> getParserForType() {
            return PARSER;
        }

        public PubsubMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PubsubMessageOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private MapField<String, String> attributes_;
            private Object messageId_;
            private Timestamp publishTime_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> publishTimeBuilder_;
            private Object orderingKey_;

            public static final Descriptors.Descriptor getDescriptor() {
                return PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_descriptor;
            }

            protected MapFieldReflectionAccessor internalGetMapFieldReflection(int number) {
                switch (number) {
                    case 2:
                        return this.internalGetAttributes();
                    default:
                        throw new RuntimeException("Invalid map field number: " + number);
                }
            }

            protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int number) {
                switch (number) {
                    case 2:
                        return this.internalGetMutableAttributes();
                    default:
                        throw new RuntimeException("Invalid map field number: " + number);
                }
            }

            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PubsubMessage.class, Builder.class);
            }

            private Builder() {
                this.data_ = ByteString.EMPTY;
                this.messageId_ = "";
                this.orderingKey_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.data_ = ByteString.EMPTY;
                this.messageId_ = "";
                this.orderingKey_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (PubsubMessage.alwaysUseFieldBuilders) {
                    this.getPublishTimeFieldBuilder();
                }

            }

            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.data_ = ByteString.EMPTY;
                this.internalGetMutableAttributes().clear();
                this.messageId_ = "";
                this.publishTime_ = null;
                if (this.publishTimeBuilder_ != null) {
                    this.publishTimeBuilder_.dispose();
                    this.publishTimeBuilder_ = null;
                }

                this.orderingKey_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_descriptor;
            }

            public PubsubMessage getDefaultInstanceForType() {
                return PubsubMessage.getDefaultInstance();
            }

            public PubsubMessage build() {
                PubsubMessage result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public PubsubMessage buildPartial() {
                PubsubMessage result = new PubsubMessage(this);
                if (this.bitField0_ != 0) {
                    this.buildPartial0(result);
                }

                this.onBuilt();
                return result;
            }

            private void buildPartial0(PubsubMessage result) {
                int from_bitField0_ = this.bitField0_;
                if ((from_bitField0_ & 1) != 0) {
                    result.data_ = this.data_;
                }

                if ((from_bitField0_ & 2) != 0) {
                    result.attributes_ = this.internalGetAttributes();
                    result.attributes_.makeImmutable();
                }

                if ((from_bitField0_ & 4) != 0) {
                    result.messageId_ = this.messageId_;
                }

                int to_bitField0_ = 0;
                if ((from_bitField0_ & 8) != 0) {
                    result.publishTime_ = this.publishTimeBuilder_ == null ? this.publishTime_ : (Timestamp)this.publishTimeBuilder_.build();
                    to_bitField0_ |= 1;
                }

                if ((from_bitField0_ & 16) != 0) {
                    result.orderingKey_ = this.orderingKey_;
                }

                result.bitField0_ = to_bitField0_;
            }

            public Builder clone() {
                return (Builder)super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder)super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return (Builder)super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (Builder)super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder)super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder)super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof PubsubMessage) {
                    return this.mergeFrom((PubsubMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(PubsubMessage other) {
                if (other == PubsubMessage.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getData() != ByteString.EMPTY) {
                        this.setData(other.getData());
                    }

                    this.internalGetMutableAttributes().mergeFrom(other.internalGetAttributes());
                    this.bitField0_ |= 2;
                    if (!other.getMessageId().isEmpty()) {
                        this.messageId_ = other.messageId_;
                        this.bitField0_ |= 4;
                        this.onChanged();
                    }

                    if (other.hasPublishTime()) {
                        this.mergePublishTime(other.getPublishTime());
                    }

                    if (!other.getOrderingKey().isEmpty()) {
                        this.orderingKey_ = other.orderingKey_;
                        this.bitField0_ |= 16;
                        this.onChanged();
                    }

                    this.mergeUnknownFields(other.getUnknownFields());
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                } else {
                    try {
                        boolean done = false;

                        while(!done) {
                            int tag = input.readTag();
                            switch (tag) {
                                case 0:
                                    done = true;
                                    break;
                                case 10:
                                    this.data_ = input.readBytes();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    MapEntry<String, String> attributes__ = (MapEntry)input.readMessage(PubsubMessage.AttributesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                                    this.internalGetMutableAttributes().getMutableMap().put((String)attributes__.getKey(), (String)attributes__.getValue());
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.messageId_ = input.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    input.readMessage(this.getPublishTimeFieldBuilder().getBuilder(), extensionRegistry);
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.orderingKey_ = input.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                default:
                                    if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                        done = true;
                                    }
                            }
                        }
                    } catch (InvalidProtocolBufferException var9) {
                        InvalidProtocolBufferException e = var9;
                        throw e.unwrapIOException();
                    } finally {
                        this.onChanged();
                    }

                    return this;
                }
            }

            public ByteString getData() {
                return this.data_;
            }

            public Builder setData(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.data_ = value;
                    this.bitField0_ |= 1;
                    this.onChanged();
                    return this;
                }
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = PubsubMessage.getDefaultInstance().getData();
                this.onChanged();
                return this;
            }

            private MapField<String, String> internalGetAttributes() {
                return this.attributes_ == null ? MapField.emptyMapField(PubsubMessage.AttributesDefaultEntryHolder.defaultEntry) : this.attributes_;
            }

            private MapField<String, String> internalGetMutableAttributes() {
                if (this.attributes_ == null) {
                    this.attributes_ = MapField.newMapField(PubsubMessage.AttributesDefaultEntryHolder.defaultEntry);
                }

                if (!this.attributes_.isMutable()) {
                    this.attributes_ = this.attributes_.copy();
                }

                this.bitField0_ |= 2;
                this.onChanged();
                return this.attributes_;
            }

            public int getAttributesCount() {
                return this.internalGetAttributes().getMap().size();
            }

            public boolean containsAttributes(String key) {
                if (key == null) {
                    throw new NullPointerException("map key");
                } else {
                    return this.internalGetAttributes().getMap().containsKey(key);
                }
            }

            /** @deprecated */
            @Deprecated
            public Map<String, String> getAttributes() {
                return this.getAttributesMap();
            }

            public Map<String, String> getAttributesMap() {
                return this.internalGetAttributes().getMap();
            }

            public String getAttributesOrDefault(String key, String defaultValue) {
                if (key == null) {
                    throw new NullPointerException("map key");
                } else {
                    Map<String, String> map = this.internalGetAttributes().getMap();
                    return map.containsKey(key) ? (String)map.get(key) : defaultValue;
                }
            }

            public String getAttributesOrThrow(String key) {
                if (key == null) {
                    throw new NullPointerException("map key");
                } else {
                    Map<String, String> map = this.internalGetAttributes().getMap();
                    if (!map.containsKey(key)) {
                        throw new IllegalArgumentException();
                    } else {
                        return (String)map.get(key);
                    }
                }
            }

            public Builder clearAttributes() {
                this.bitField0_ &= -3;
                this.internalGetMutableAttributes().getMutableMap().clear();
                return this;
            }

            public Builder removeAttributes(String key) {
                if (key == null) {
                    throw new NullPointerException("map key");
                } else {
                    this.internalGetMutableAttributes().getMutableMap().remove(key);
                    return this;
                }
            }

            /** @deprecated */
            @Deprecated
            public Map<String, String> getMutableAttributes() {
                this.bitField0_ |= 2;
                return this.internalGetMutableAttributes().getMutableMap();
            }

            public Builder putAttributes(String key, String value) {
                if (key == null) {
                    throw new NullPointerException("map key");
                } else if (value == null) {
                    throw new NullPointerException("map value");
                } else {
                    this.internalGetMutableAttributes().getMutableMap().put(key, value);
                    this.bitField0_ |= 2;
                    return this;
                }
            }

            public Builder putAllAttributes(Map<String, String> values) {
                this.internalGetMutableAttributes().getMutableMap().putAll(values);
                this.bitField0_ |= 2;
                return this;
            }

            public String getMessageId() {
                Object ref = this.messageId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.messageId_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getMessageIdBytes() {
                Object ref = this.messageId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.messageId_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public Builder setMessageId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.messageId_ = value;
                    this.bitField0_ |= 4;
                    this.onChanged();
                    return this;
                }
            }

            public Builder clearMessageId() {
                this.messageId_ = PubsubMessage.getDefaultInstance().getMessageId();
                this.bitField0_ &= -5;
                this.onChanged();
                return this;
            }

            public Builder setMessageIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    PubsubMessage.checkByteStringIsUtf8(value);
                    this.messageId_ = value;
                    this.bitField0_ |= 4;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasPublishTime() {
                return (this.bitField0_ & 8) != 0;
            }

            public Timestamp getPublishTime() {
                if (this.publishTimeBuilder_ == null) {
                    return this.publishTime_ == null ? Timestamp.getDefaultInstance() : this.publishTime_;
                } else {
                    return (Timestamp)this.publishTimeBuilder_.getMessage();
                }
            }

            public Builder setPublishTime(Timestamp value) {
                if (this.publishTimeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.publishTime_ = value;
                } else {
                    this.publishTimeBuilder_.setMessage(value);
                }

                this.bitField0_ |= 8;
                this.onChanged();
                return this;
            }

            public Builder setPublishTime(Timestamp.Builder builderForValue) {
                if (this.publishTimeBuilder_ == null) {
                    this.publishTime_ = builderForValue.build();
                } else {
                    this.publishTimeBuilder_.setMessage(builderForValue.build());
                }

                this.bitField0_ |= 8;
                this.onChanged();
                return this;
            }

            public Builder mergePublishTime(Timestamp value) {
                if (this.publishTimeBuilder_ == null) {
                    if ((this.bitField0_ & 8) != 0 && this.publishTime_ != null && this.publishTime_ != Timestamp.getDefaultInstance()) {
                        this.getPublishTimeBuilder().mergeFrom(value);
                    } else {
                        this.publishTime_ = value;
                    }
                } else {
                    this.publishTimeBuilder_.mergeFrom(value);
                }

                if (this.publishTime_ != null) {
                    this.bitField0_ |= 8;
                    this.onChanged();
                }

                return this;
            }

            public Builder clearPublishTime() {
                this.bitField0_ &= -9;
                this.publishTime_ = null;
                if (this.publishTimeBuilder_ != null) {
                    this.publishTimeBuilder_.dispose();
                    this.publishTimeBuilder_ = null;
                }

                this.onChanged();
                return this;
            }

            public Timestamp.Builder getPublishTimeBuilder() {
                this.bitField0_ |= 8;
                this.onChanged();
                return (Timestamp.Builder)this.getPublishTimeFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getPublishTimeOrBuilder() {
                if (this.publishTimeBuilder_ != null) {
                    return (TimestampOrBuilder)this.publishTimeBuilder_.getMessageOrBuilder();
                } else {
                    return this.publishTime_ == null ? Timestamp.getDefaultInstance() : this.publishTime_;
                }
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getPublishTimeFieldBuilder() {
                if (this.publishTimeBuilder_ == null) {
                    this.publishTimeBuilder_ = new SingleFieldBuilderV3(this.getPublishTime(), this.getParentForChildren(), this.isClean());
                    this.publishTime_ = null;
                }

                return this.publishTimeBuilder_;
            }

            public String getOrderingKey() {
                Object ref = this.orderingKey_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.orderingKey_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getOrderingKeyBytes() {
                Object ref = this.orderingKey_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.orderingKey_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public Builder setOrderingKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.orderingKey_ = value;
                    this.bitField0_ |= 16;
                    this.onChanged();
                    return this;
                }
            }

            public Builder clearOrderingKey() {
                this.orderingKey_ = PubsubMessage.getDefaultInstance().getOrderingKey();
                this.bitField0_ &= -17;
                this.onChanged();
                return this;
            }

            public Builder setOrderingKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    PubsubMessage.checkByteStringIsUtf8(value);
                    this.orderingKey_ = value;
                    this.bitField0_ |= 16;
                    this.onChanged();
                    return this;
                }
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        private static final class AttributesDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry;

            private AttributesDefaultEntryHolder() {
            }

            static {
                defaultEntry = MapEntry.newDefaultInstance(PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_AttributesEntry_descriptor, FieldType.STRING, "", FieldType.STRING, "");
            }
        }
    }

}
