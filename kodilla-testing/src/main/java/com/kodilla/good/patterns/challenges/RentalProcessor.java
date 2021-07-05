package com.kodilla.good.patterns.challenges;

public class RentalProcessor {
    private InformationService informationService;
    private ClientService clientService;
    private ShoperService shoperService

    public RentalProcessor(final informationService informationService,
                           final clientService rentalService,
                           final shoperService rentalRepository) {
        this.informationService = informationService;
        this.clientService = rentalService;
        this.shoperService = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
