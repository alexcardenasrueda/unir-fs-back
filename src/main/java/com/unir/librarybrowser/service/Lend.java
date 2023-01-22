package com.unir.librarybrowser.service;

import com.unir.librarybrowser.domain.dto.LendDto;
import com.unir.librarybrowser.exception.GenericException;
import com.unir.librarybrowser.exception.NotFoundException;

import java.util.List;

public interface Lend {

    public List<LendDto> getAll() throws GenericException;

    public LendDto getById(long id) throws GenericException, NotFoundException;
}
