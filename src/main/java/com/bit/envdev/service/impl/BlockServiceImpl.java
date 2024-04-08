package com.bit.envdev.service.impl;

import com.bit.envdev.constant.ReportRefType;
import com.bit.envdev.entity.BlockMember;
import com.bit.envdev.entity.Member;
import com.bit.envdev.repository.BlockInquiryCommentRepository;
import com.bit.envdev.repository.BlockInquiryRepository;
import com.bit.envdev.repository.BlockMemberRepository;
import com.bit.envdev.repository.MemberRepository;
import com.bit.envdev.service.BlockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BlockServiceImpl implements BlockService {
    private final MemberRepository memberRepository;
    private final BlockMemberRepository blockMemberRepository;
    private final BlockInquiryRepository blockInquiryRepositoty;
    private final BlockInquiryCommentRepository blockCommentRepositoty;

    @Override
    public void block(String refType, Long refId, int period) {
        LocalDateTime blockPeriod = LocalDateTime.now().plusDays(period);

        ReportRefType.ofCode(refType);
        if (refType.equals(ReportRefType.INQUIRY.getLegacyCode())) {
            // BlockInquiry blockInquiry = BlockInquiry.builder()
            //         .inquiry()
            //         .build();
        }

        if (refType.equals(ReportRefType.INQUIRY_COMMENT.getLegacyCode())) {

        }

        if (refType.equals(ReportRefType.MEMBER.getLegacyCode())) {
            Member member = memberRepository.findById(refId).get();
            BlockMember blockMember = BlockMember.builder()
                    .member(member)
                    .blockPeriod(blockPeriod)
                    .build();
            blockMemberRepository.save(blockMember);
        }
    }

    @Override
    public void unblock(String refType, Long refId) {
//        ReportRefType.ofCode(refType);
//        if (refType.equals(ReportRefType.INQUIRY.getLegacyCode())) {
//            blockInquiryRepositoty.updateStateById(refId);
//        }
//
//        if (refType.equals(ReportRefType.INQUIRY_COMMENT.getLegacyCode())) {
//            blockCommentRepositoty.updateStateById(refId);
//        }
//
//        if (refType.equals(ReportRefType.MEMBER.getLegacyCode())) {
//            blockMemberRepository.updateStateById(refId);
//        }
    }
}
