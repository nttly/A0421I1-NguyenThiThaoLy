package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int arr[]= new int[n];
        inputArray(arr,scanner);
        System.out.println("Nhập phần tử cần xóa:");
        int s = scanner.nextInt();
        xoa(arr,s);

    }
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void showArray(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print( b[i]+"\t");
        }
    }
    public static void xoa(int[] arr, int soCanXoa) {
        int size = arr.length;
        int dem = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == soCanXoa) {
                dem++;
            }
        }
        int newArr[] = new int[size - dem];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == soCanXoa) {
                continue;
            }
            newArr[k] = arr[i];
            k++;
        }
        if (dem > 0) {
            showArray(newArr);
        } else {
            System.out.println("không tìm thấy giá trị cần xoá");
        }
    }
}
