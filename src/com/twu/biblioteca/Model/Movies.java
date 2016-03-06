package com.twu.biblioteca.Model;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Model.Exceptions.BookAlreadyPresentException;
import com.twu.biblioteca.Model.Exceptions.InvalidInputException;
import com.twu.biblioteca.Model.Exceptions.NotFoundException;
import com.twu.biblioteca.Model.Exceptions.UserNotLoggedInException;

import java.util.List;

public class Movies implements Items {
    List<Item> movies;
    private Customers loginModel;

    public Movies(List<Item> movies, Customers loginModel) {
        this.movies = movies;
        this.loginModel = loginModel;
    }

    @Override
    public List<Item> getItems() {
        return movies;
    }

    @Override
    public Item checkoutItem(int movieNumber) throws NotFoundException, InvalidInputException, UserNotLoggedInException {
        loginModel.checkIfLoggedIn();

        if (movieNumber == -1) {
            throw new InvalidInputException();
        }

        for (Item movie : movies) {
            if (movie.getNumber() == movieNumber && !movie.checkoutStatus()) {
                movie.checkout(loginModel.loggedInUserId());
                return movie;
            }

        }
        throw new NotFoundException("This movie doesn't exist in the records");
    }

    @Override
    public void returnItem(Integer movieNumber) throws InvalidInputException, BookAlreadyPresentException, UserNotLoggedInException {
        loginModel.checkIfLoggedIn();

        if (movieNumber == -1) {
            throw new InvalidInputException();
        }

        for (Item movie : movies) {
            if (movie.getNumber().equals(movieNumber) && movie.checkoutStatus()) {
                movie.returnItem();
                return;
            }

        }
        throw new BookAlreadyPresentException("This movie doesn't exist in the records");
    }

    public void checkIfLoggedIn() throws UserNotLoggedInException {
        if (!loginModel.checkIfLoggedIn())
            throw new UserNotLoggedInException();
    }
}
