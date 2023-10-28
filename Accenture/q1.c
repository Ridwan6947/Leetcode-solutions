#include <stdio.h>
#include <string.h>
#include <pthread.h>

// Function to check if a string is a "good string"
void *Good_String(void *args) {
    char *str = (char *)args;
    int is_good = 1; // Assume it's a good string by default

    for (int i = 0; i < strlen(str); i++) {
        if (str[i] < '0' || str[i] > '9') {
            is_good = 0; // Not a good string if it contains non-digit characters
            break;
        }
    }

    int *result = (int *)malloc(sizeof(int));
    *result = is_good;
    pthread_exit(result);
}

// Function to calculate the sum of digits in a string
void *Sum_Of_Digits(void *args) {
    char *str = (char *)args;
    int sum = 0;

    for (int i = 0; i < strlen(str); i++) {
        if (str[i] >= '0' && str[i] <= '9') {
            sum += str[i] - '0';
        }
    }

    int *result = (int *)malloc(sizeof(int));
    *result = sum;
    pthread_exit(result);
}

int main() {
    char str[1000];
    scanf("%s", str);
    pthread_t thread1, thread2;
    pthread_create(&thread1, NULL, Good_String, (void *)str);
    pthread_create(&thread2, NULL, Sum_Of_Digits, (void *)str);

    int *check = NULL;
    int *sum = NULL;

    pthread_join(thread1, (void **)&check);
    pthread_join(thread2, (void **)&sum);

    printf("%d %d", *check, *sum);

    free(check);
    free(sum);

    return 0;
}
