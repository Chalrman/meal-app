package com.softdev.yourmeal;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class SQLeditor {

    private final JdbcTemplate jdbcTemplate;

    public SQLeditor(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void deleteUserById(Long userId) {
        jdbcTemplate.update("DELETE FROM dietary_profiles WHERE user_id = ?", userId);
        jdbcTemplate.update("DELETE FROM app_users WHERE id = ?", userId);
        jdbcTemplate.update("DELETE FROM saved_meals WHERE user_id = ?", userId);
    }

    public void deleteNullMeals(Long userId) {
        jdbcTemplate.update("DELETE FROM saved_meals WHERE id = ?", userId);
    }
}
