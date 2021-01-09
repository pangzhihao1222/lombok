package net.xdclass.shopmanager.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Objects;

/**
 * final 只生成get方法
 * static 不生成get和 set 方法
 */
//@Getter(AccessLevel.PUBLIC)
//@Setter(AccessLevel.PUBLIC)
//@ToString(exclude = {"pwd"}) //不包括pwd字段,可以实现脱敏  @ToString(of = {"email"})  //只写一个email,其它去掉
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode     //默认全部匹配 @EqualsAndHashCode(of={"name","pwd"})只写"name","pwd"相等才相等
///*
//    @RequiredArgsConstructor 专为下面这种属性生成构造函数
//    @NonNull
//    private final String name;
//*/




@Data  //相当除了@NoArgsConstructor和@AllArgsConstructor的所有
@Builder
public class User {

//    @Setter(AccessLevel.NONE) //不生成set方法
//    @Getter(AccessLevel.NONE) //不生成get方法
    private int id;

    private String name;

    private String email;

    private String phone;

    private String pwd;

    private Date createTime;
//
//    public void login(@NonNull String pwd){
//        System.out.println(pwd);
//    }

//    /**
//     * （可以使用Lombok去实现）
//     * 如果姓名，邮箱，电话相等，那么就是同一个对象，即使内存地址不同
//     * @param o
//     * @return
//     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, email, phone);
//    }
}
