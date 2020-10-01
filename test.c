#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct {
    char firstname[22];
    char lastname [22];
    char position[22];
} Teammate;

typedef struct {
    int      size;
    char     name[22];
    Teammate roster[22];
} Team;

int main(void){

    
    Team *team = malloc(sizeof(Team));


    // --------- OPERATIONS THAT WORK -------- //
    // strcpy(team->roster[0].lastname, "elliott"); N
    // strcpy((*(*team).roster).lastname, "elliott"); N 
    // strcpy((*team).roster[0].lastname, "elliott"); N
    // strcpy((team->roster).lastname, "elliott");
    // strcpy(team->roster.lastname, "elliott");
    // strcpy((*team).roster.lastname, "elliott");
    
    // --------- DOESN'T WORK OPERATION -------- //
    //strcpy(team.roster[0].lastname, "elliott");
    printf("%s\n", team->roster.lastname);


    // (*team->roster).lastname = 'c';
    // printf("%s", (*team->roster).lastname);
}