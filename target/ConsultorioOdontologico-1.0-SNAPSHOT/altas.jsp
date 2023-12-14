<%-- 
    Document   : altas
    Created on : 6 oct. 2023, 08:58:07
    Author     : TEKTRONIC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@include file="componentes/header.jsp" %>>
<%@include file="componentes/bodyInicial.jsp" %>>
<h1>Alta de Odontologo</h1>
<p>Este es el apartado para hacer altas de odontologo</p>
                            <form class="user">
                                <div class="form-group colm  ">
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user" id="dni"
                                            placeholder="DNI">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="NOMBRE">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido"
                                            placeholder="APELIIDO">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono"
                                            placeholder="TELEFONO">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion"
                                            placeholder="DIRECCION">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fechanaci"
                                            placeholder="FECHA NACIMIENTO">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad"
                                            placeholder="ESPECIALIDAD">
                                    </div>
                                </div>
                                
                                <!-- Aca va ir todo con respecto al turno y horario -->
                                
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    Registrar Odontologo
                                </a>
                               
                            </form>
<%@include file="componentes/bodyFinal.jsp" %>>
