<template>
  <div class="regist">
    <h1 class="underline">회원 가입</h1>
    <div class="regist_form">
      <label for="user_id">아이디</label>
      <input type="text" v-model="user_id" ref="user_id" /><br />
      <label for="user_password">비밀번호</label>
      <input type="password" v-model="user_password" ref="user_password" /><br />
      <label for="user_name">이름</label>
      <input type="text" v-model="user_name" ref="user_name" /><br />
      <label for="email_id">이메일</label>
      <input type="text" v-model="email_id" ref="email_id" /><br />
      <label for="email_domain">이메일 도메인</label>
      <input type="text" v-model="email_domain" ref="email_domain" /><br />
      <br />
      <button @click="checkValue">등록</button>
      <button @click="moveList">목록</button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      user_id: "",
      user_password: "",
      user_name: "",
      email_id: "",
      email_domain: "",
    };
  },
  methods: {
    //사용자 입력값 체크
    checkValue() {
      let err = true;
      let msg = "";
      if (!this.user_id) {
        msg = "아이디를 입력해주세요";
        err = false;
        this.$refs.user_id.focus();
      } else if (!this.user_password) {
        msg = "비밀번호를 입력해주세요";
        err = false;
        this.$refs.user_password.focus();
      } else if (!this.user_name) {
        msg = "이름을 입력해주세요";
        err = false;
        this.$refs.user_name.focus();
      } else if (!this.email_id) {
        msg = "이메일을 입력해주세요";
        err = false;
        this.$refs.email_id.focus();
      } else if (!this.email_domain) {
        msg = "이메일 도메인을 입력해주세요";
        err = false;
        this.$refs.email_domain.focus();
      }

      if (!err) {
        alert(msg);
      } else {
        this.signUp();
      }
    },
    signUp() {},
  },
};
</script>

<style></style>
