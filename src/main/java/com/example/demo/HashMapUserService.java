package com.example.demo;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class HashMapUserService implements UsersService {
    // HashMap para almacenar los usuarios, donde la clave es el ID del usuario y el valor es el objeto User
    private HashMap<Long, User> userMap = new HashMap<>();
    private static long userIdCounter = 0 ;
    @Override
    public void createUser(User newUser) {
        // Asigna un nuevo ID al usuario y luego lo agrega al HashMap
        long newUserId = generateUserId();
        newUser.setId(newUserId);
        userMap.put(newUserId, newUser);
    }

    @Override
    public User getUserById(long userId) {
        // Obtiene el usuario correspondiente al ID del HashMap
        return userMap.get(userId);
    }

    @Override
    public void updateUser(long userId, User updatedUser) {
        // Actualiza el usuario en el HashMap
        if (userMap.containsKey(userId)) {
            updatedUser.setId(userId); // Asegura que el ID del usuario actualizado sea el mismo que el original
            userMap.put(userId, updatedUser);
        } else {
            // Manejar caso de usuario no encontrado
            System.out.println("Usuario no encontrado.");
        }
    }

    @Override
    public void deleteUser(long userId) {
        // Elimina el usuario del HashMap
        userMap.remove(userId);
    }

    // Método auxiliar para generar un ID único para cada usuario
    private long generateUserId() {
        return ++userIdCounter;
    }
}

