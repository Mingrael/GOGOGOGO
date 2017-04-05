/**
 * Created by Миша on 05.04.2017.
 */

    package com;
    //Здесь мы храним роли пользователей.
    public class UsersRoles {

        int id;
        String role, path, user_login;

        public Role(int id, String role, String path, String user_login) {
            this.id = id;
            this.role = role;
            this.path = path;
            this.user_login = user_login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getUser_login() {
            return user_login;
        }

        public void setUser_login(String user_login) {
            this.user_login = user_login;
        }
    }

}
