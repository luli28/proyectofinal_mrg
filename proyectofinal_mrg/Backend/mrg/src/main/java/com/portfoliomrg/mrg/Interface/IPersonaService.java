package com.portfoliomrg.mrg.Interface;

import com.portfoliomrg.mrg.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar unn objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona pero la buscamos por ide
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
