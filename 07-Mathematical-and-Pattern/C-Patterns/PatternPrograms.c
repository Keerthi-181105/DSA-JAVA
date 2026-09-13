#include <stdio.h>

void printRightTriangle(int rows) {
    for (int row = 1; row <= rows; row++) {
        for (int column = 1; column <= row; column++) printf("* ");
        printf("\n");
    }
}

void printPyramid(int rows) {
    for (int row = 1; row <= rows; row++) {
        for (int space = row; space < rows; space++) printf(" ");
        for (int column = 1; column <= 2 * row - 1; column++) printf("*");
        printf("\n");
    }
}

void printNumberTriangle(int rows) {
    for (int row = 1; row <= rows; row++) {
        for (int column = 1; column <= row; column++) printf("%d ", column);
        printf("\n");
    }
}

int main(void) {
    printRightTriangle(4);
    printf("\n");
    printPyramid(4);
    printf("\n");
    printNumberTriangle(4);
    return 0;
}
