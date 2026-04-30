package e04_lamda;

/**
 * 제네릭을 사용하는 함수형 인터페이스
 * @param <T> 처리할 데이터의 타입
 */
public interface Method<T> {
	/**
	 * 두 개의 데이터를 받아 결과를 반환하는 추상 메서드
	 */
	public T run(T a, T b);
}
