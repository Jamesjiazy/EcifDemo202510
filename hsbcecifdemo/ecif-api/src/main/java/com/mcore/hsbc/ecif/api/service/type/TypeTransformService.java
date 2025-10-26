package com.mcore.hsbc.ecif.api.service.type;

public interface TypeTransformService {

    <T,R> R convert(T req, Class<R> resp);

}