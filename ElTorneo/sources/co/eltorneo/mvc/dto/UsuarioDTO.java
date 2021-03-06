/*
 * UsuarioDTO.java
 *
 * Proyecto: Gestion de Creditos
 * Cliente: Promociones Empresariales
 * Copyright 2016 by Mobiltech SAS 
 * All rights reserved
 */
package co.eltorneo.mvc.dto;

import co.eltorneo.common.util.Generales;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sys. E. Diego Armando Hernandez
 */
public class UsuarioDTO implements Serializable {

    String idUsuario = Generales.EMPTYSTRING;
    String usuario = Generales.EMPTYSTRING;
    String nombre = Generales.EMPTYSTRING;
    String idTipoDocumento = Generales.EMPTYSTRING;
    String tipoDocumento = Generales.EMPTYSTRING;
    String documento = Generales.EMPTYSTRING;
    String idTipoRol = Generales.EMPTYSTRING;
    String rol = Generales.EMPTYSTRING;
    String idTipoUsuario = Generales.EMPTYSTRING;
    String tipoUsuario = Generales.EMPTYSTRING;
    String direccion = Generales.EMPTYSTRING;
    String idMunicipio = Generales.EMPTYSTRING;
    String municipio = Generales.EMPTYSTRING;
    String idDepartamento = Generales.EMPTYSTRING;
    String telefono = Generales.EMPTYSTRING;
    String correo = Generales.EMPTYSTRING;
    String imagenPerfil = Generales.EMPTYSTRING;
    String clave = Generales.EMPTYSTRING;
    String departamento = Generales.EMPTYSTRING;
    String estado = Generales.EMPTYSTRING;
    String idCliente = Generales.EMPTYSTRING;
    String descripcionErrorLogueo = Generales.EMPTYSTRING;
    String clienteEstado = Generales.EMPTYSTRING;
    String clienteNombre = Generales.EMPTYSTRING;
    String registradoPor = Generales.EMPTYSTRING;
    String fechaRegistro = Generales.EMPTYSTRING;
    ArrayList<MenuDTO> menu = new ArrayList<>();

    public String getDescripcionErrorLogueo() {
        return descripcionErrorLogueo;
    }

    public void setDescripcionErrorLogueo(String descripcionErrorLogueo) {
        this.descripcionErrorLogueo = descripcionErrorLogueo;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteEstado() {
        return clienteEstado;
    }

    public void setClienteEstado(String clienteEstado) {
        this.clienteEstado = clienteEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getIdTipoRol() {
        return idTipoRol;
    }

    public void setIdTipoRol(String idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(String idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<MenuDTO> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuDTO> menu) {
        this.menu = menu;
    }

    public String toStringJson() {
        String dtoJsonString = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            dtoJsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (Exception e) {
        }
        return dtoJsonString;
    }
}
