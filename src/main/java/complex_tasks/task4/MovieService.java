package complex_tasks.task4;
import java.util.*;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {

    private final Map<Movie, List<Rating<T>>> ratings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        double val = rating.getValue().doubleValue();
        if (val < 1.0 || val > 10.0) {
            throw new IllegalArgumentException("Оценка должна быть от 1 до 10");
        }

        ratings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public double getAverageRating(Movie movie) {
        List<Rating<T>> movieRatings = List.copyOf(ratings.getOrDefault(movie, List.of()));
        if (movieRatings.isEmpty()) {
            throw new IllegalArgumentException("Нет оценок для фильма");
        }

        return movieRatings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> getSortedMoviesByRating() {
        return List.copyOf(
                ratings.entrySet().stream()
                .filter(e -> !e.getValue().isEmpty())
                .sorted((e1, e2) -> Double.compare(
                        average(e2.getValue()),
                        average(e1.getValue())
                ))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
        );
    }

    private double average(List<Rating<T>> ratings) {
        return ratings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }
}
