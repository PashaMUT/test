package org.bnt.mapper;

import org.bnt.entity.Provider;

import java.util.List;

public interface ProviderMapper {

    List<Provider> getAll();

    void remove (int providerid);

    int add (Provider provider);

    int update (Provider provider);
}
