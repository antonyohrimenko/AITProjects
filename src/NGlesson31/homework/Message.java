package NGlesson31.homework;

import java.util.Objects;

public class Message <T> {
        private T content;

        public Message(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "Message content: " + content;
        }

        // equal и hashCode добавил просто чтобы не забывать
        // тут он в задаче нам не нужен
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message<?> message = (Message<?>) o;
        return Objects.equals(content, message.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
