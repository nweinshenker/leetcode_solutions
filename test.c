#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct _Square {
	int size;
	int **array;
} Square;

Square * generate(int size);

int main(void) {
    int n = 5;
    Square *square = generate(n);

    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         printf("%d ", *(*(square->array + i) + j));
    //     }
    //     printf("\n");
    // }

    for (int i = 0; i < n; i++) {
        free(square->array[i]);
    }
    free(square->array);
    free(square);
    return 0;
}

Square * generate(int n) {
    // Initialize a square to have the memory needed
    // to store the dimensions of
    Square *square = malloc(sizeof(Square));
    if (square == NULL)
    {
        printf("ALLOCATION ERROR: square\n");
        exit(1);
    }
    square->size = n;
    //create aray to represent square
    square-> array = malloc(sizeof(int *) * n);
    if (square->array == NULL)
    {   
        free(square);
        printf("ALLOCATION ERROR");
        exit(1);
    }
    // Allocate memory for each row in the square
    for (int i = 0; i < n; i++)
    {
        *(square->array + i) = malloc(n*sizeof(int));
        if (*(square->array + i) == NULL)
        {
            for(int j = 0; j < i; j++){
				free(*(square->array + j));
			}
			free(square->array);
			free(square);
            printf("ALLOCATION ERROR");
            exit(1);
        }
    }

    for (int i = 0; i < square->size; i++) {
        for (int j = 0; j < square->size; j++) {
            *(*(square->array + i) + j) = 0;
        }
    }
    //loop that will creatue magic square using Siamese Algorithm
    //initliaze starting row and column
	int num_items = n * n;
	//Start
	int i = 0;
	int j = n/2;
	// Siamese Method
	for(int num = 1; num <= num_items; num++){
		*(*(square->array + i) + j) = num;
		i--;
		j++;
		if(num % n == 0){
			i = i + 2;
			j--;
		}else{
			if(j == n)
				j = j - n;
			else if (i < 0)
				i = i + n;
		}
	}
    return square;
}

void write_to_file(Square * square, char *filename)
{
    // Reads file in to the console
    FILE *fp;
    fp = fopen(filename, "w+");
    if( fp == NULL) {
        printf("Error opening file!\n");
        exit(1);
    }
    // Acces ssie and prints  to the array
    int size = square->size;
    fprintf(fp, "%d\n", size);
    for (int i = 0; i <  size; i++) {
        for (int j = 0; j < size; j++){
            if( j + 1 == size)
                fprintf(fp, "%d", *(*(square->array+i)+j) );
            else
                fprintf(fp, "%d,", *(*(square->array+i)+j) );
        }
        fprintf(fp,"\n");
    }
    fclose(fp);
}

