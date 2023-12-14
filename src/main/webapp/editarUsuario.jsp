<%-- 
    Document   : altaUsuario
    Created on : 6 oct. 2023, 17:02:00
    Author     : TEKTRONIC
--%>

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


 <%@include file="componentes/header.jsp" %>>
<%@include file="componentes/bodyInicial.jsp" %>>
<h1>Editar Usuario</h1>
<p>Este es el apartado para modificar el usuario</p>
                <% Usuario usu =(Usuario)request.getSession().getAttribute("usuEditar");%>
                              <form class="user" action="SvEditUsuarios" method="POST">
                                <div class="form-group colm  ">
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                                            placeholder="NOMBRE DE USUARIO" value="<%=usu.getNombreUsuario()%>" >
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="PASSWORD" value="<%=usu.getContrasenia()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="ROL" value="<%=usu.getRol()%>">
                                    </div>
                                    
                                </div>
                                
                                <!-- Aca va ir todo con respecto al turno y horario -->
                                
                                <button type="submit" class="btn btn-primary btn-user btn-block">
                                    Guardar Usuario
                                </button>
                               
                            </form>
<%@include file="componentes/bodyFinal.jsp" %>>