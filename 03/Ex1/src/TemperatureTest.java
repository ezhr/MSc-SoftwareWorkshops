import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 22-10-2019
 */

class TemperatureTest {

    @Test
    void test1() {
        double temperatures[] = {15.03, -1.27, 1.87, -16.71, 6.35, -4.56, 16.0, 21.75, 28.1, 4.94, -8.42, -9.33, -3.41, 5.56, -15.0, -9.38, 3.48, 6.52, -18.36, 0.14, 7.78, -3.92, -5.53, -0.1, -12.35, 16.08, 13.36, 26.15, 26.96, -17.39, 14.6, 22.36, 26.33, 13.33, -10.86, 8.55, -11.78, 16.24, -14.69, -17.68, -14.67, -10.77, 10.24, -0.88, 16.63, 26.33, 9.83, 18.67, 21.89, 3.14, -11.86, 27.92, 9.81, 22.57, 19.28, 8.15, 0.49, 2.64, 10.63, -19.75, -8.85, -6.83, -0.37, -9.43, -14.62, -8.97, -10.24, -11.15, 23.28, 12.66, 27.8, -18.18, -6.73, -10.0, 19.72, 9.45, -2.15, 27.22, -5.85, -5.52, 18.47, 24.8, 5.16, -10.55, 27.45, -5.22, -0.99, -5.29, -14.3, -8.93, -8.83, 18.45, 5.2, 12.2, 29.63, 28.52, -2.03, 9.34, 5.55, 1.5, 3.37, 7.03, -1.34, 4.8, -17.26, -6.23, -5.84, -9.76, 25.84, 11.05, 14.01, -13.64, 21.25, 13.33, 11.29, 14.41, 29.45, -4.75, -4.67, 10.38, 23.54, -12.35, -6.49, 4.45, 11.29, -7.65, -17.32, -8.72, 22.28, 11.65, 23.84, 13.76, 12.29, 24.71, -4.21, 8.11, -10.61, -4.95, -16.81, -16.33, -7.44, 23.24, -6.84, 6.52, 11.4, -9.15, -18.33, -6.54, 6.9, 29.41, -7.89, 19.49, -1.95, -7.9, -11.81, -4.15, 2.23, -7.95, 4.43, 24.62, 9.18, 23.29, 23.57, -18.06, -13.93, -4.06, 4.03, 9.24, 2.66, -6.39, 23.51, -0.78, -3.05, 8.97, -7.36, -12.34, 1.6, 8.38, 15.59, -6.63, -8.21, 21.26, -17.94, 4.23, 18.15, -10.48, -15.06, 26.81, -15.04, 18.35, 28.75, 1.37, -6.53, -11.29, 1.03, 15.3, -15.72, -4.37, 23.84, -0.7, -8.27, -4.85, -15.48, 2.12, 23.47, 25.7, 1.86, -15.39, -13.84, -10.18, -18.92, -5.07, -1.29, -4.81, -0.34, -10.95, 24.61, 5.38, -1.27, 21.31, 8.93, 13.3, -9.09, 7.27, 24.77, -1.63, 21.28, -2.33, 3.57, 3.96, -12.14, 12.02, 0.64, -5.26, 8.19, 8.2, -14.32, 29.2, 25.59, 13.99, -17.97, 7.84, -5.18, 29.53, -8.97, 11.02, 5.93, 16.42, 10.9, 9.42, 12.75, 21.19, 9.04, 10.1, -8.68, 28.05, -9.06, 9.4, 16.81, 19.24, -8.19, -12.55, 21.8, 13.82, 26.24, 7.91, -3.94, 17.7, -12.47, 21.98, 6.07, -10.67, 14.82, 21.1, 20.25, 26.91, 25.09, 22.94, 9.53, 10.26, 16.43, -2.36, 19.65, -8.56, 19.66, 23.31, 5.63, 12.78, -8.92, -15.9, 14.15, -10.87, 1.8, 25.86, -1.46, -4.66, -2.9, 6.68, -4.77, -6.85, -14.93, -1.27, 20.27, -14.0, 14.59, 2.01, -7.94, 14.31, 5.19, 23.83, 26.78, 16.91, -14.83, 24.9, -19.85, 6.13, -8.86, 12.68, 24.71, 13.14, -19.26, -8.14, -13.26, 21.6, -9.07, 20.76, 22.38, 7.04, 1.69, -5.1, -8.25, 16.42, -18.53, 14.43, 9.34, 20.35, 14.98, 12.86, 11.67, 6.02, 6.43, -5.34, -10.7, 12.55, -19.13, 17.39, -10.15, -2.59, -11.94, 18.07, 20.25, -13.13, -7.23, 7.11, -3.39, 11.69, -7.2, -11.86, 29.22, -18.94, -19.71, 2.24, 19.84, 8.44, -2.39};
        int expected = 315;
        int actual = Temperature.coldest(temperatures);
        assertEquals(expected, actual, "The coldest day was day " + expected + ", not day " + actual);
    }

    @Test
    void test2() {
        double temperatures[] = {-9.9, 9.73, 11.67, 27.4, 22.09, -17.98, 2.13, 2.24, -3.45, 18.54, 3.73, 9.92, -11.04, 7.51, 29.58, -11.9, 10.53, -4.18, 23.4, -1.28, 12.41, -5.98, -1.97, 8.61, 17.73, -2.35, 18.22, 22.11, -5.75, -9.95, -14.74, 17.18, -3.45, 5.15, 4.4, 0.89, -7.52, -0.04, -10.88, -18.06, -1.81, 15.64, -18.02, 22.63, 24.55, 17.24, -11.36, 15.67, 23.25, -13.47, 5.13, -11.04, 2.34, -17.68, 6.62, -6.81, 4.42, 19.37, 10.7, -18.7, 16.64, -4.45, 13.52, -7.15, 11.37, 28.92, 20.36, -4.31, -19.12, -14.24, 15.67, -13.62, 10.11, 6.01, 11.48, 28.39, 28.33, 15.44, -10.89, 11.17, 26.48, -8.48, -16.82, -7.73, -6.1, 27.75, -16.34, 24.53, -16.63, 11.57, 10.51, -17.6, 28.04, 4.01, 10.77, 3.8, -17.61, -4.59, 28.07, 21.11, 21.74, 16.8, 27.19, 14.23, -10.78, 4.29, 14.5, -6.27, 11.24, -7.25, -14.72, 3.18, -16.52, 21.33, -17.8, 8.14, -4.26, -0.86, 29.44, 22.0, 2.82, 13.86, -8.29, -15.76, 29.87, 24.1, -15.58, 14.46, -2.63, 14.73, -6.32, -4.6, 8.26, 13.48, 20.87, 7.09, 24.52, -11.04, -6.61, 20.99, 9.8, 1.77, -8.84, -10.74, 3.35, 0.41, 19.4, 3.92, -13.29, -13.85, 13.14, 21.35, 9.96, -13.01, 7.22, -0.76, 26.14, 13.16, -2.62, 1.46, 19.44, -3.71, 27.35, -5.37, 17.89, -11.19, 29.82, -4.86, 13.55, 27.47, 11.58, 27.91, -13.29, 28.16, -0.1, -5.77, -17.58, -19.84, 25.18, -16.53, -18.45, -12.14, -17.96, 5.29, 26.16, 20.19, 2.48, 29.37, -9.66, 24.07, 1.23, -15.09, 26.59, 27.57, -7.93, 7.33, -14.67, 23.91, -13.91, 10.93, -2.18, -11.64, -8.43, 11.9, 11.09, -14.44, -13.39, 5.61, 3.29, 17.09, -8.1, -10.11, 18.45, -1.32, -1.22, -0.54, 7.04, 7.23, 27.92, -15.8, 21.92, -14.27, 0.07, -11.99, -5.16, 0.91, -18.39, 26.0, 6.49, 7.01, 25.22, 6.31, -16.66, 0.7, 20.79, 27.35, 6.45, 9.39, 2.93, 27.15, -5.78, -6.0, -16.57, 11.47, 0.91, -12.12, -4.36, 4.59, 7.01, 1.04, -16.02, -12.53, 7.44, 29.94, -13.82, 10.57, -15.93, -17.75, 13.8, -11.92, -7.95, 0.67, 2.05, 21.47, -1.25, 14.61, -10.67, 8.86, -12.89, 18.01, -3.57, 23.06, -1.52, -13.02, -11.48, -9.33, 6.13, 14.28, 2.95, 22.49, -17.41, 19.12, -0.52, -8.61, -11.23, -15.84, 6.98, 29.31, 21.98, -1.43, -2.57, 12.43, 23.12, -10.72, 19.99, -2.1, 1.08, -9.63, 24.54, 28.39, 5.31, -5.83, -17.65, -5.42, -19.12, 1.46, 19.46, 20.44, -18.99, -19.31, -17.42, -13.01, 11.65, 10.99, 29.22, -0.82, 22.78, 17.5, 3.82, 6.15, -0.49, -3.59, 27.27, 26.73, 19.72, 19.36, -0.24, 0.65, -1.32, -16.96, 26.11, 13.86, 18.29, -3.24, -7.77, 21.9, -15.41, 8.11, 15.47, 5.7, 2.16, -0.45, -10.58, 14.93, 2.85, 12.17, -0.84, -0.49, 25.31, -2.96, 22.23, 9.01, -9.03, -2.25, 14.41, 23.88, -9.16, 1.47, -17.33, 26.0, 0.53, 21.27, -9.12, 28.7, -12.95};
        int expected = 178;
        int actual = Temperature.coldest(temperatures);
        assertEquals(expected, actual, "The coldest day was day " + expected + ", not day " + actual);
    }

    @Test
    void test3() {
        double temperatures[] = {-12.63, -18.77, -14.01, 9.18, 9.8, 29.36, 21.37, -6.81, -2.88, 8.65, 29.37, 11.43, 12.43, 16.18, 11.74, 2.04, 14.93, 3.76, -11.13, 18.0, 26.87, -14.62, -10.64, 6.53, 3.01, 20.47, 5.61, -11.88, -1.6, 26.49, -2.9, 13.05, 3.88, 5.46, -16.92, -15.96, -0.29, 25.63, 27.69, -9.94, 23.09, -3.75, -12.49, 10.56, -18.15, 9.27, 0.23, 19.87, 28.49, -13.47, 16.65, 23.46, -17.82, 5.03, 15.39, 9.25, 29.99, 5.85, 2.76, 14.58, -0.24, -15.24, 28.52, 5.85, -7.6, 28.1, -5.55, 11.75, 26.35, 1.2, 20.11, -10.69, 13.71, -5.15, -6.8, 0.74, -14.36, 3.44, 28.56, 20.53, 13.13, 26.55, 0.57, 27.2, 14.43, -18.54, 9.5, -2.42, 4.96, -0.66, -14.74, 28.38, 5.58, 7.49, -14.19, -19.06, 11.63, 18.48, -3.14, -10.75, 24.57, -11.73, 13.81, 20.75, -16.35, -16.97, 27.22, -1.68, 16.55, 26.69, -1.45, -8.82, 25.71, -11.63, -11.86, 11.64, 4.84, 22.26, -0.23, 8.03, 22.73, 29.85, 5.7, -16.31, -14.19, 17.77, 10.53, 13.39, 27.99, 27.15, 10.11, 17.89, -5.53, 1.78, 15.93, -0.58, -18.54, -19.35, 19.56, 18.17, -2.96, 16.63, -12.18, -16.73, 22.26, -9.8, 15.67, 2.67, -5.06, -17.8, 1.03, -18.94, 0.58, 26.62, 27.78, -17.57, 24.83, 16.06, 9.19, -2.88, -5.81, 7.56, 2.92, 26.85, -11.26, -13.13, -19.19, -13.66, 5.42, 24.74, -14.66, 26.5, 12.42, -10.19, -16.91, 24.54, 27.42, 25.08, -18.57, -17.02, 0.11, 19.03, 24.77, 13.35, 18.32, 5.15, -19.11, 28.04, 3.37, 28.22, 12.54, 12.45, -0.67, 25.4, 12.08, -3.07, 13.17, 20.08, 26.67, -4.99, -8.26, -6.43, 19.19, -14.6, 28.92, 27.58, 29.47, 28.04, -2.41, 14.09, -2.35, 24.49, 18.08, 22.13, 19.85, -10.75, 15.69, 8.58, -13.04, -17.47, 16.36, -6.06, 14.44, -14.98, -12.11, -15.67, 1.97, 15.96, 18.69, -12.58, 29.5, 27.41, 5.89, 6.87, 23.24, 28.89, 29.33, -4.51, 11.32, 10.98, 3.43, 9.31, 2.04, 22.52, 29.81, 10.68, 16.45, 15.37, -12.85, -7.18, -4.39, 16.52, 3.14, -14.71, 0.36, 1.05, -12.33, 7.07, 13.14, 27.27, -19.87, 0.16, 0.25, 12.17, 10.31, 8.5, -11.18, 22.27, 18.63, 20.49, 0.97, -19.61, 20.9, -11.75, 7.74, -11.21, 20.26, -12.78, 2.82, 8.91, -10.34, 0.62, 2.25, 6.47, -4.74, 24.59, 7.74, 22.22, 5.17, 6.31, 11.76, 10.79, 12.06, 9.52, 11.86, 9.1, -12.92, 15.17, -10.72, -13.28, 4.88, 0.71, 8.11, 15.86, 1.85, -2.26, 6.6, -18.89, 15.81, 23.39, 2.6, -13.13, 13.98, 7.72, -13.38, -5.8, 2.19, 24.44, -7.76, -11.18, 25.03, 14.01, 11.77, -3.82, 8.69, 5.46, -16.06, -2.67, -4.58, -1.27, -5.9, 8.49, 1.72, -15.31, -7.7, -11.46, 3.27, 15.9, 2.49, -14.5, 28.98, 20.41, 22.83, 28.26, 9.15, 10.62, -0.25, 19.66, -19.42, 1.69, -3.13, 16.19, 22.35, -0.96, -5.12, 7.52, 9.04, 13.44, 29.23, -19.3, 5.77, 22.26, -11.03, -4.82, 19.08};
        int expected = 261;
        int actual = Temperature.coldest(temperatures);
        assertEquals(expected, actual, "The coldest day was day " + expected + ", not day " + actual);
    }

    @Test
    void test4() {
        double temperatures[] = {-15.33, 12.86, 14.84, -19.28, 9.37, 13.14, -2.97, 23.04, 10.24, 12.73, 24.22, -2.98, -8.54, 25.11, -7.25, 24.31, -2.54, -19.62, -1.26, 27.96, -10.65, -7.75, -16.53, 18.33, -15.67, -5.4, 12.51, 17.71, -14.52, -0.34, -0.31, -7.67, -14.03, 25.09, 23.93, -14.28, 2.57, 28.56, -0.28, -15.09, 16.99, 1.58, 10.32, 1.8, 11.73, -8.35, 27.52, -15.51, 21.1, 0.4, 14.97, 8.27, 28.46, -12.82, -3.27, 25.16, 24.3, -1.89, 23.72, 8.47, 18.14, 2.62, 3.65, -3.68, -6.47, 0.38, 19.66, -11.51, 9.22, 9.5, -19.27, 9.54, -4.46, -13.45, 18.63, -14.92, -10.66, 18.58, 12.21, -13.13, -15.77, 4.16, 23.48, 29.24, 20.66, 21.85, -19.74, -5.05, -11.23, 23.22, 17.56, 7.85, 23.74, -0.61, -2.95, 17.97, 20.04, 11.17, -17.67, 3.46, -2.2, 5.16, 18.65, -11.86, -16.25, -16.37, 15.64, 14.58, 0.58, -10.7, -8.17, -14.64, 26.14, -11.53, -11.0, 0.36, -19.09, 1.51, 3.1, -10.91, -4.27, 25.05, 15.13, -5.43, 17.6, 24.06, -15.61, 2.28, 4.47, 9.68, 11.78, 16.26, 1.65, -1.16, 3.01, 3.08, 29.27, 1.74, 15.53, 11.76, -5.12, 25.47, 9.99, 19.63, -16.44, -2.32, 23.69, 5.96, -1.76, 8.32, 13.4, 6.44, 19.57, 16.4, 1.04, 13.24, 1.4, -5.24, 12.47, -6.4, 11.49, 10.86, 19.16, 12.07, -12.1, -8.27, -10.63, 19.25, 13.2, 3.85, -5.9, -13.2, 10.21, 18.25, 9.35, -4.95, -10.9, -13.7, 7.19, -18.24, 20.43, 29.91, -14.99, 21.45, 1.9, 21.81, 5.08, -13.45, 2.17, -19.4, 1.03, 28.39, -12.2, 18.48, -9.93, -6.23, 2.55, 22.26, 23.99, 24.8, -0.12, -19.65, 18.95, 25.89, -7.84, -12.18, 22.41, 24.4, 19.99, -19.94, 25.89, -12.47, 23.04, 28.4, 2.66, 3.78, -12.94, 1.1, 0.62, 11.56, 10.71, 18.34, -1.55, -9.12, 19.05, -5.69, 18.73, -6.1, 16.94, -11.93, 16.06, -4.47, -19.8, 21.58, 3.39, -4.14, -4.09, 3.65, -8.06, -3.96, -17.39, -1.61, -7.28, 5.41, 8.53, -15.39, -10.22, -10.21, -14.89, 7.57, 1.04, -5.46, 5.96, -11.22, 4.27, -8.78, 15.61, 19.55, -18.86, -14.25, -11.18, 21.42, 21.14, 22.63, 28.14, 8.5, 7.43, 16.95, 28.12, 13.94, 22.7, 12.55, -19.92, 29.77, 6.08, -7.68, -17.63, -17.9, -6.84, 2.35, -16.09, 26.05, 14.15, 22.2, -7.37, 12.9, 24.38, -11.3, -3.45, -9.66, 6.87, -15.93, -17.33, 12.84, 5.55, -1.98, -9.9, 15.53, 3.13, 14.67, -0.56, -0.86, -5.27, 24.15, -12.34, 12.57, -6.87, -18.87, 17.47, 28.19, 23.74, 11.86, 13.07, -12.84, 28.63, 14.51, 18.85, 19.57, 8.68, 6.25, 10.01, 16.8, 28.28, 1.27, -10.42, -3.8, 20.2, 3.43, -13.22, 9.62, -9.0, -10.94, 25.39, 29.12, 4.57, -7.91, 8.19, 23.91, 18.98, -6.52, 9.55, -8.95, 4.95, -4.64, 23.74, 29.93, -17.54, 11.82, 29.72, 5.28, -9.66, -15.42, -5.62, -1.31, 26.44, 8.03, -8.72, 0.5, 5.87, -1.32, -11.52, 7.88, 19.78, -13.81, -1.4};
        int expected = 210;
        int actual = Temperature.coldest(temperatures);
        assertEquals(expected, actual, "The coldest day was day " + expected + ", not day " + actual);
    }

    @Test
    void test5() {
        double temperatures[] = {19.73, 1.17, 19.64, 2.84, 7.05, 22.83, 20.31, -18.4, 12.06, 2.6, 18.57, -19.77, 14.05, 20.25, 5.9, 10.14, 23.99, -18.36, -2.73, -7.64, 6.45, -13.72, 1.0, -0.34, -3.22, 15.17, 1.1, 29.81, 27.78, 1.31, 21.36, 1.21, 14.93, 20.23, 2.81, -11.38, 3.01, 10.81, 24.7, 3.26, -15.4, 4.9, 20.14, 19.04, 11.74, 22.23, 26.52, 5.78, 9.74, -6.31, 24.34, 1.44, -13.32, -2.3, 2.45, -9.03, 14.74, 17.84, -6.93, 27.63, 26.64, 26.3, -2.94, -13.01, 0.9, -9.13, -16.49, 3.36, -17.87, -5.21, -8.72, 2.31, 14.71, -16.44, -5.14, 17.63, 15.16, 11.81, -6.97, -8.36, 28.74, 12.94, -15.89, -8.24, -13.81, 15.78, 28.1, -2.59, -5.42, -14.66, -6.1, 9.31, -2.19, 26.65, 13.23, 10.28, -15.63, -17.33, 23.35, 23.47, -15.11, 16.73, 12.29, -8.52, -14.08, 22.22, 29.93, 17.88, 18.79, 7.67, 29.32, -9.65, 8.91, 23.62, 25.5, 12.41, 6.93, 24.68, 23.54, -7.21, -3.12, 0.04, 27.91, 11.35, 23.85, -13.6, 19.12, -8.72, 11.44, 28.6, -18.44, 18.85, -15.19, 7.3, -17.17, 12.58, 16.95, 25.37, 5.11, -10.67, 22.86, -17.92, 8.51, 26.97, 19.92, 24.5, 8.98, 8.34, 0.83, -14.75, -10.06, -10.23, -1.51, 1.08, -7.88, 1.04, 24.51, 26.99, 22.43, 15.57, 13.46, 0.29, 14.62, 17.32, 5.77, 15.23, -14.92, -3.09, 27.49, -17.45, -8.51, 3.86, 11.0, 26.08, 5.89, -16.87, -15.7, 29.51, 9.12, 29.8, 20.53, 27.99, -16.98, 16.61, 7.54, 13.69, 10.04, 5.62, 25.77, -5.37, -18.18, 12.59, -10.21, -2.62, 6.5, -10.39, 23.79, -2.18, 29.43, -9.52, 20.01, -3.07, 24.45, 12.8, 8.77, 5.53, 29.7, 1.45, -11.1, 26.95, 20.6, 1.37, 5.48, -17.67, 21.94, 28.01, 22.88, 2.98, 15.96, 8.57, 20.43, 13.59, 9.56, 15.54, 10.84, 3.69, -14.42, -1.19, -12.51, 7.22, 8.32, 4.56, -11.54, -3.03, -4.72, 5.36, 2.45, 16.7, 27.36, 21.45, 16.34, 20.79, -5.8, 19.97, 11.66, 26.94, -6.0, 10.46, 7.46, 29.9, 9.11, 13.63, 1.25, 29.97, 19.14, 2.99, 27.9, 7.94, 29.03, -7.43, 6.5, -1.54, 24.05, -6.17, 7.16, 11.07, -7.34, -10.36, 24.32, 18.79, -9.65, -10.59, -11.09, 7.25, -5.45, 11.44, 0.21, 9.44, 8.59, 11.46, -18.32, -14.1, 11.47, 14.81, -3.87, 26.08, 19.79, 10.99, -9.0, -12.85, -12.9, 13.44, 15.29, -18.0, -11.02, 8.31, -6.12, -9.68, 4.66, -1.57, 18.91, -1.16, 6.18, -6.47, -14.54, 26.87, 9.23, -5.79, -6.65, 2.8, 16.63, -15.42, 18.58, 9.11, 29.33, 10.9, -15.54, 25.55, -16.85, -13.74, -19.22, 10.1, -7.65, 15.78, 8.54, -11.5, -15.78, 3.9, 14.59, -12.4, 25.15, -18.88, 13.78, 29.62, -3.23, 8.72, -4.99, 18.33, 0.38, -3.55, 20.44, -16.9, 25.28, 29.74, 27.02, 9.42, -15.1, -13.14, 6.98, 20.18, -10.82, -17.35, 20.83, -6.76, 13.99, 29.46, 0.53, 5.1, 14.67, 9.55, -19.03, 28.51, -13.96, 13.45, 25.66};
        int expected = 12;
        int actual = Temperature.coldest(temperatures);
        assertEquals(expected, actual, "The coldest day was day " + expected + ", not day " + actual);
    }
}