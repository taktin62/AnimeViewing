package com.animeviewing.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeviewing.application.repositories.AnimationRepository;

@Service
@Transactional
public class AnimationService {
    @Autowired
    AnimationRepository animationRepository;
}
