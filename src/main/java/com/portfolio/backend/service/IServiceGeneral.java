package com.portfolio.backend.service;

import com.portfolio.backend.model.DatosGenerales;

public interface IServiceGeneral {
    public DatosGenerales verGeneral();
    public void modificarGeneral(Long id, DatosGenerales datosGenerales);
}
