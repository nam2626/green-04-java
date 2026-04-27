package e06_static;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

public class MemoryInfo {
    public static void main(String[] args) {
        //Heap 영역
        Runtime runtime = Runtime.getRuntime();

        // JVM이 사용 가능한 최대 힙 메모리 크기 (Xmx로 설정된 값)
        long maxMemory = runtime.maxMemory();

        // 현재 JVM이 사용 중인 힙 메모리 크기
        long totalMemory = runtime.totalMemory();

        // 현재 JVM에서 사용 가능한 힙 메모리 크기
        long freeMemory = runtime.freeMemory();

        System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + " MB");
        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");

        //Method 영역(데이터 영역) --> 메타 영역
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();

        for (MemoryPoolMXBean memoryPoolMXBean : memoryPoolMXBeans) {
            if ("Metaspace".equals(memoryPoolMXBean.getName())) {
                MemoryUsage usage = memoryPoolMXBean.getUsage();
                System.out.println("Metaspace Used: " + usage.getUsed() / (1024 * 1024) + " MB");
                System.out.println("Metaspace Max: " + (usage.getMax() == -1 ? "Unlimited" : usage.getMax() / (1024 * 1024) + " MB"));
            }
        }

    }
}
