package com.example.demo;

public interface UsersService {
    void createUser(User newUser); //para crear un nuevo usuario
    User getUserById(long userId);// para obtener un usuario por su Id
    void updateUser(long userId, User updateUser);// hacer una actualizacion de este usuario
    void deleteUser(long userId);// eliminar un usuario existente

}
