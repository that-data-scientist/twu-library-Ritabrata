package com.twu.biblioteca.Model.Commands;

import com.twu.biblioteca.Controller.ItemController;

public class ReturnMovieCommand implements Command{
    private ItemController itemController;

    public ReturnMovieCommand(ItemController itemController) {
        this.itemController = itemController;
    }

    @Override
    public int execute() {
        itemController.returnItem();
        return 1;
    }
}