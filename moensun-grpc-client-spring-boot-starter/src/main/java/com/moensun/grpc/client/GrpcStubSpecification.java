package com.moensun.grpc.client;

import org.springframework.cloud.context.named.NamedContextFactory;

import java.util.Arrays;
import java.util.Objects;

public class GrpcStubSpecification implements NamedContextFactory.Specification {
    private String name;

    private Class<?>[] configuration;

    public GrpcStubSpecification() {
    }

    public GrpcStubSpecification(String name, Class<?>[] configuration) {
        this.name = name;
        this.configuration = configuration;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Class<?>[] getConfiguration() {
        return configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrpcStubSpecification that = (GrpcStubSpecification) o;
        return Objects.equals(name, that.name) &&
                Arrays.equals(configuration, that.configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, configuration);
    }

    @Override
    public String toString() {
        return new StringBuilder("GrpcStubSpecification{")
                .append("name='").append(name).append("', ")
                .append("configuration=").append(Arrays.toString(configuration))
                .append("}").toString();
    }
}