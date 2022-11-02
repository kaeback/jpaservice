package com.example.vo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_member")
public class Member extends BaseEntity {
	
	@Id @GeneratedValue
	private Long id;

	@Column(name = "name", nullable = false , length = 10)
	private String username;

	private Integer age;

	@Enumerated(EnumType.STRING)
	private RoleType roleType;

	private LocalDateTime createDate;

	private LocalDateTime lastModifiedDate;

	@Lob
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	private Group group;
}
