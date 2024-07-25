package NGlesson40.homework;

public class User {
        private String login;
        private String password;
        private String email;

        public User(String login, String password, String email) {
            this.login = login;
            this.password = password;
            this.email = email;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public void setLogin(String login) {
            if (login.length() < 3) {
                throw new IllegalArgumentException("Логин должен быть не менее 3 символов!");
            }
            this.login = login;
        }

        public void setPassword(String password) {
            if (password.length() < 8) {
                throw new IllegalArgumentException("Пароль должен быть не менее 8 символов!");
            }
            this.password = password;
        }

        public void setEmail(String email) {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Email должен содержать '@'!");
            }
            this.email = email;
        }

        public boolean isValidPassword(String password) {
            return this.password.equals(password);
        }
    }

