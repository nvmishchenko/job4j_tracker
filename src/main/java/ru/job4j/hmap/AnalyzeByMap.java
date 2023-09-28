package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double count = 0;
        double rsl = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                count++;
            }
        }
        return rsl / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double rsl = 0;
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
            }
            Label label = new Label(pupil.name(), rsl / pupil.subjects().size());
            labels.add(label);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
             for (Subject subject : pupil.subjects()) {
                 map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
             }
        }
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            String subjectName = mp.getKey();
            Label label = new Label(subjectName, mp.getValue() / pupils.size());
            labels.add(label);
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int rsl = 0;
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
            }
            Label label = new Label(pupil.name(), rsl);
            labels.add(label);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            labels.add(new Label(mp.getKey(), mp.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
