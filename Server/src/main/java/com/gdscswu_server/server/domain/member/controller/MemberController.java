package com.gdscswu_server.server.domain.member.controller;

import com.gdscswu_server.server.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberController {
    private final MemberService memberService;

    /*
    <참고용 예시 코드> spring context에 저장된 member entity 가져오기
    @GetMapping
    public ResponseEntity<ResponseDto> test(@AuthenticationPrincipal ContextUser contextUser) {
        Member member = contextUser.getMember();

        return ResponseEntity.ok(DataResponseDto.of(member, 200));
    }
     */

}
