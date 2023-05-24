@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals(Должно вернуться true, если пользователь совершеннолетний, true, isAdult);
}

// Напиши код здесь
@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals(Должно вернуться false, если как пользователь совершеннолетний, false, isAdult);
}

@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals(Должно вернуться true, если пользователю 18, true, isAdult);
}
